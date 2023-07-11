SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python310-colorlog-6.7.0-1.5.aarch64.rpm"
RPM_HASH = "061257339666bd3d6a37b1912f22f4a7e101f7f37180b615088fe5c0dc2b3d58d1e2e99eec852eeef79184845d54245d762d732aba7c3a6bd00259a1669a9722"

RPROVIDES:${PN} += "python3.10dist-colorlog \
python310-colorlog \
python3dist-colorlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
