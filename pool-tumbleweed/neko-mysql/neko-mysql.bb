SUMMARY = "Neko virtual machine MySQL library"
DESCRIPTION = "MySQL library for the Neko virtual machine."
LICENSE = "GPL-2.0+"

PV = "2.3.0"

RPM_NAME = "neko-mysql-2.3.0-3.1.aarch64.rpm"
RPM_HASH = "289e03e6ca8e471725fc954a0a0889d6f3702a5f12e4c3a3ad84262b297cd66b00b6ae31c02b7699691fc9d52b005589b736b760ae27e9aff1328ae618c2f2e1"

RPROVIDES:${PN} += "neko-mysql \
neko-mysql(aarch-64) \
nekovm-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libneko.so.2()(64bit) \
neko"

inherit rpm
