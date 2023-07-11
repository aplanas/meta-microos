SUMMARY = "Tool for adjusting the color temperature of the screen"
DESCRIPTION = "Redshift adjusts the color temperature of the screen according to time. \
This may help easing eyestrain when working at night. \
Time-independent manual operation and individual gamma curve \
setting is possible as well."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "redshift-1.12-7.11.aarch64.rpm"
RPM_HASH = "b9a63a3928f93a99c78c4e2cbc4615883a4a5e7e05da32852ad27fb3c71615466123ecfba7ba1400dcb055374fc56a91a62a0935e06966821199d07c32a64e49"

RPROVIDES:${PN} += "config-redshift \
redshift"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libdrm.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libxcb-randr.so.0 \
libxcb.so.1 \
systemd"

inherit rpm
