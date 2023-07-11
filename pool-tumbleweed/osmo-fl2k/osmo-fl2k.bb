SUMMARY = "SDR driver for FL2000 based USB 3.0 to VGA adapters"
DESCRIPTION = "Osmo-fl2k allows to use USB 3.0 to VGA adapters based on the \
Fresco Logic FL2000 chip as general purpose DACs and SDR transmitter \
generating a continuous stream of samples by avoiding the HSYNC and \
VSYNC blanking intervals."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "osmo-fl2k-0.1.1+git.20200602-1.12.aarch64.rpm"
RPM_HASH = "deb5c9e63722058f4b927623bb5ff312fdbdb9140534fc9270e03359002b4beb6a4d3d31e7e9cf0196e0c9033bc7fbd51a857eb5d314b3b261d5e3392c9c627f"

RPROVIDES:${PN} += "osmo-fl2k"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libosmo-fl2k.so.0"

inherit rpm
