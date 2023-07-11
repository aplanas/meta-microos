SUMMARY = "Log formatting with colors"
DESCRIPTION = "colorlog.ColoredFormatter is a formatter for use with Python's logging module. \
It allows colors to be placed in the format string, which is mostly useful \
when paired with a StreamHandler that is outputting to a terminal. \
This is accomplished by added a set of terminal color codes to the record \
before it is used to format the string."
LICENSE = "MIT"

PV = "6.7.0"

RPM_NAME = "python311-colorlog-6.7.0-1.5.aarch64.rpm"
RPM_HASH = "f1c4f9a8ed503e4966de121ad138d98ebe5b4215751b98f6ec26ff29989de28f48deae2fbfe670975f6d4fda53fdb39260b79459e770a2a36837bf9278c98ff0"

RPROVIDES:${PN} += "python3-colorlog \
python3.11dist-colorlog \
python311-colorlog \
python3dist-colorlog"

RDEPENDS:${PN} += "python-abi"

inherit rpm
