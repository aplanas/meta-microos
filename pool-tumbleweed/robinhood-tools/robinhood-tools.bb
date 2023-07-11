SUMMARY = "Tools for accessing the statistics"
DESCRIPTION = "The commanline tools for extracting the information out of the \
robinhood database. Commands work like du or df and find. Be careful \
as robinhood_find does not always honor the file permissions."
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-tools-3.1.7-2.2.aarch64.rpm"
RPM_HASH = "940ed37397371c2e94386682ae145a6ab7372b47a96b2461a780d7b849740ffd646a5e16ef757bb632c569cca9bd2b3ded7e1a19d6dd4aa4da5004e519c8dcec"

RPROVIDES:${PN} += "robinhood-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmariadb.so.3"

inherit rpm
