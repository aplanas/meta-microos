SUMMARY = "X-, Y-, and Z-Modem Data Transfer Protocols"
DESCRIPTION = "rzsz allows you to use 'sz filename' to send a file to your local \
system."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.21~rc"

RPM_NAME = "rzsz-0.12.21~rc-4.9.aarch64.rpm"
RPM_HASH = "39d226c63a78ff29aa531c5abc833629b80f13374e4df5e9d3e2df98499588e784a36a0011c273727ed110cbf6788848eba845f75fbf049e050bdc7f9b1fa1c2"

RPROVIDES:${PN} += "lrzsz \
rzsz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
