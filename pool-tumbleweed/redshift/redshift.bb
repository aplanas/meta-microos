SUMMARY = "Tool for adjusting the color temperature of the screen"
DESCRIPTION = "Redshift adjusts the color temperature of the screen according to time. \
This may help easing eyestrain when working at night. \
Time-independent manual operation and individual gamma curve \
setting is possible as well."
LICENSE = "GPL-3.0-only"

PV = "1.12"

RPM_NAME = "redshift-1.12-7.10.aarch64.rpm"
RPM_HASH = "60f830016d2b20760d12326c05a0b2f87cad2b2c6dc3ac80112829450c71ca157c93a44bf66ce78dcfa21d98f25718f9395fdbf979e2d8f613505c8db44ed765"

RPROVIDES:${PN} += "config-redshift \
redshift"

RDEPENDS:${PN} += "/bin/sh \
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
