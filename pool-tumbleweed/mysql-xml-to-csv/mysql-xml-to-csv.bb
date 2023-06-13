SUMMARY = "Convert MySQL XML output to CSV"
DESCRIPTION = "mysql-xml-to-csv converts MySQL XML query results (i.e., produced using \
the mysql(1) command when given the --xml flag) into a CSV file."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "mysql-xml-to-csv-1.0.0-1.7.aarch64.rpm"
RPM_HASH = "624f076f03e495ffb6da63d156e70cbf89d1adde6cd0ac175235454f696034ac7320d8e3b7ac20d2b73717f7047ac7b417622d3ab080e62a18089d925fcb9e33"

RPROVIDES:${PN} += "mysql-xml-to-csv \
mysql-xml-to-csv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexpat.so.1()(64bit)"

inherit rpm
