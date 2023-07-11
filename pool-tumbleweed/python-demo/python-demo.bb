SUMMARY = "Python Demonstration Scripts"
DESCRIPTION = "Various demonstrations of what you can do with Python and a number of \
programs that are useful for building or extending Python."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-demo-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "7e8edeefeed42edd4d463ac4313ba8bb5df1e4b5045cb1d5aaad8f43c8ffda6c21430062dbd34d949d61b1a8812aed83e138c00a3a0774285dea63a1a331516f"

RPROVIDES:${PN} += "pyth-dmo \
python-demo \
python2-demo"

RDEPENDS:${PN} += "python-base"

inherit rpm
