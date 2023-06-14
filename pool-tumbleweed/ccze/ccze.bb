SUMMARY = "A log colorizer"
DESCRIPTION = "CCZE is a modular log colorizer, with plugins for apm, \
exim, fetchmail, httpd, postfix, procmail, squid, syslog, ulogd, \
vsftpd, xferlog and more."
LICENSE = "GPL-2.0+"

PV = "0.2.1.2"

RPM_NAME = "ccze-0.2.1.2-2.23.aarch64.rpm"
RPM_HASH = "4c364787de8444aa9a50fdf1d88415d5ebde199b2b44e325572f833a4ff8a08f32e9eb33a6492d77779f28e8838264d874c77be7f7b20df4c7b133eb013c62e5"

RPROVIDES:${PN} += "ccze \
config-ccze"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libpcre.so.1 \
libtinfo.so.6"

inherit rpm
