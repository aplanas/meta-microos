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

RPM_NAME = "rungetty-1.2-9.10.aarch64.rpm"
RPM_HASH = "2db1851b0acbf9b44bab9aa30de528411f2c371936a7869dd4483d490a0bd620e0073004b2a107f74ea58b61a438f9d449267aa86e86a0b3615b69f4067aa1e7"

RPROVIDES:${PN} += "rungetty \
sysvinit-/sbin/mingetty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
