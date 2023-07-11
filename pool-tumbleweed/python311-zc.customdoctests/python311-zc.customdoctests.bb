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

RPM_NAME = "python311-zc.customdoctests-1.0.1-2.10.noarch.rpm"
RPM_HASH = "ec911aa961e1c8cb53e289ae613411b63afc8fae3e5d0f73cc5fe152008e933060f19e55b5a1784e7b18a6a5725de158aa8c6845df32672a751c38b8582b4b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zc.customdoctests \
python3.11dist-zc.customdoctests \
python311-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
