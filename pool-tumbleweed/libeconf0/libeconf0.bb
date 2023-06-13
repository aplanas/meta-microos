SUMMARY = "Enhanced config file parser ala systemd"
DESCRIPTION = "Enhanced config file parser, which merges config files placed \
in several locations into one."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libeconf0-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "0ec520f8aef8e33704628138b25e8b20979e4dcce75298f3a504029a2b2e6e88acb380808801f4df24be0a1dbd7ed6b8dfc34ffa9e59fec031f50b53de5e8051"

RPROVIDES:${PN} += "libeconf.so.0()(64bit) \
libeconf.so.0(LIBECONF_0.2)(64bit) \
libeconf.so.0(LIBECONF_0.3)(64bit) \
libeconf.so.0(LIBECONF_0.4)(64bit) \
libeconf.so.0(LIBECONF_0.5)(64bit) \
libeconf.so.0(LIBECONF_ALPHA)(64bit) \
libeconf0 \
libeconf0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
