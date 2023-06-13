SUMMARY = "Minimal Getty for Virtual Consoles"
DESCRIPTION = "rungetty might be the getty you were looking for when you want to run any \
program, not just login. If a different program than login is used it usually \
is run as nobody:nogroup, or the user/group specified on the commandline. \
rungetty can even be configured to autologin, under certain circumstances. \
See the manual page for more information. \
 \
You have to change some lines in /etc/inittab for having any effect after \
installing the package.  rungetty is based on mingetty and therefore not \
suitable for serial use."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "rungetty-1.2-9.9.aarch64.rpm"
RPM_HASH = "21f4d1fde4be1ef8a422200446a136506554f0715508af640aff6ea8c2aac86911ad2d14de38f99ac7b260306c0d9b84928d41c5f447b4434b34652affcd65d7"

RPROVIDES:${PN} += "rungetty \
rungetty(aarch-64) \
sysvinit:/sbin/mingetty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
