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

RPM_NAME = "python39-zc.customdoctests-1.0.1-2.10.noarch.rpm"
RPM_HASH = "3b6b7a85aa4c0367f27374d553cd9763fc420ec3da7f572e810e3ef7926faa4c4f0b3d64e6c4f9bfccd728618b8bff82a88db21293bbb968a143b04ac9208ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zc.customdoctests \
python39-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
