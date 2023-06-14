SUMMARY = "zc.customdoctests -- Use doctest with other languages"
DESCRIPTION = "doctest (and recently manuel) provide hooks for using custom doctest \
parsers.  `zc.customdoctests` helps to leverage this to support other \
languages, such as JavaScript:: \
 \
    js> function double (x) { \
    ...     return x*2; \
    ... } \
    js> double(2) \
    4 \
 \
And with `manuel <http://pypi.python.org/pypi/manuel>`_, it \
facilitates doctests that mix multiple languages, such as Python, \
JavaScript, and sh."
LICENSE = "ZPL-2.1"

PV = "1.0.1"

RPM_NAME = "python39-zc.customdoctests-1.0.1-2.8.noarch.rpm"
RPM_HASH = "fad3b6db38243add0e3a5dd36411641987af953bbe91753a8995d165b22621d48041467d76754a174e394b9291081aa8b751c4cad98f6a3f0761e85633149638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zc.customdoctests \
python39-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
