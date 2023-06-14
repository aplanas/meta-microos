SUMMARY = "Tools for basic booting"
DESCRIPTION = "Helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc. System V init specific programs are in the \
sysvinit package."
LICENSE = "GPL-2.0-or-later"

PV = "3.07"

RPM_NAME = "sysvinit-tools-3.07-1.1.aarch64.rpm"
RPM_HASH = "1a947c8153f928aca75707f6f99b4b84e5384753674d9d30fd96b0e8030ea4b983613ba23d989c1fd9e823faccebdbf5101cbe9f91fdca930475778e3429cc30"

RPROVIDES:${PN} += "/sbin/start-daemon \
/sbin/startproc \
sysvinit-tools"

RDEPENDS:${PN} += "blog \
ld-linux-aarch64.so.1 \
libblogger.so.2 \
libc.so.6"

inherit rpm
