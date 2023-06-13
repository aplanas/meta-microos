SUMMARY = "Tools for accessing the statistics"
DESCRIPTION = "The commanline tools for extracting the information out of the \
robinhood database. Commands work like du or df and find. Be careful \
as robinhood_find does not always honor the file permissions."
LICENSE = "CECILL-C"

PV = "3.1.7"

RPM_NAME = "robinhood-tools-3.1.7-2.1.aarch64.rpm"
RPM_HASH = "2a079359aa8d92052ba3d367b62a4955d44a04be321f2ebd242fced0fa62602258338fe6bc8e7b2ce0ce14f9ad831253f5085a125ae4af147adc473153b153eb"

RPROVIDES:${PN} += "robinhood-tools \
robinhood-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
