SUMMARY = "Console Mouse Support"
DESCRIPTION = "The gpm (general purpose mouse) daemon is a mouse server for \
applications running on the Linux console. It provides cut and paste \
operations. If a gpm-aware program, such as mc (Midnight Commander) \
or w3m (a text-based web browser), is active, they will use to gpm to \
receive mouse events and do custom handling."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.7"

RPM_NAME = "gpm-1.20.7-19.14.aarch64.rpm"
RPM_HASH = "2c504774dcf60cbc480fcf3892abe7e22a96408c27eeaedec56a8d6b0366ad44511db35573a989a22329b97e6591f82af3b97aa70b5d962dca15424530fa122a"

RPROVIDES:${PN} += "config(gpm) \
gpm \
gpm(aarch-64) \
select"

RDEPENDS:${PN} += "/bin/sed \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgpm.so.2()(64bit) \
systemd"

inherit rpm
