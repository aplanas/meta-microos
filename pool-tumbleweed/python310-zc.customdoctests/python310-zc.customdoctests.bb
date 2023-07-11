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

RPM_NAME = "python310-zc.customdoctests-1.0.1-2.10.noarch.rpm"
RPM_HASH = "7a3d5318412b02e9a3d779a6d29d13684485d4c3f42a670243cb59c079d3459b2e3e3c1e5e667eb2b1f9ff0426665eff488a4a57555241daeefc93c9802e629b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zc.customdoctests \
python310-zc.customdoctests \
python3dist-zc.customdoctests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
