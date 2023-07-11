SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python39-colorlog-6.7.0-1.5.aarch64.rpm"
RPM_HASH = "466303e10c46c3bfb70676a360639da4a738b8cecd5757e583054d8e052df538f514bdb5a372f39dbebf82cd592dcd1c9fefda5778b4ad580d99fc94cad3c875"

RPROVIDES:${PN} += "python3.9dist-colorlog \
python39-colorlog \
python3dist-colorlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
