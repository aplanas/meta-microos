SUMMARY = "Command-line interface for controlling river"
DESCRIPTION = "A command-line utility used to control and configure river over the Wayland protocol."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-riverctl-0.2.4+g953-1.1.aarch64.rpm"
RPM_HASH = "daf4cad266f4e2a9b29db2a0764babd8c3fccf91cf921766a3a11ae9e555bff764d0ffcd60862e72177bc2e63dd83ee7961db4ea702cd7661555566ab8cb7cf2"

RPROVIDES:${PN} += "river-riverctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
