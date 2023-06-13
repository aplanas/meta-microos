SUMMARY = "An 'inetd' with Expanded Functionality"
DESCRIPTION = "xinetd takes the abilities of inetd and appends additional \
functionality: \
- Access Control \
- Prevention of 'denial of access' attacks \
- Extensive logging abilities \
- Clear configuration file"
LICENSE = "xinetd"

PV = "2.3.15.4"

RPM_NAME = "xinetd-2.3.15.4-1.19.aarch64.rpm"
RPM_HASH = "d426bd7b695a1e311f2d2d8c56bfac91b36cf022a25402e23c30fc02e115ea957d977bed0104948d9f4211259b2305f70e03de49303088ab72df615adbddf5cd"

RPROVIDES:${PN} += "config(xinetd) \
inet-daemon \
xinetd \
xinetd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libwrap.so.0()(64bit) \
systemd"

inherit rpm
