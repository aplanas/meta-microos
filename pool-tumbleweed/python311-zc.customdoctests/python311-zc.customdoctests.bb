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

RPM_NAME = "python311-zc.customdoctests-1.0.1-2.8.noarch.rpm"
RPM_HASH = "423e6151e04fd47e493ca3c3a3b05847a78fc55e464cac39e3818c5d02f15ac584e7c96ae0fe29b5a58d4dbb39f191eddfc73bae3d6d7cbc9f5e4138dd2eb47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zc.customdoctests \
python311-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
