SUMMARY = "SDR driver for FL2000 based USB 3.0 to VGA adapters"
DESCRIPTION = "Osmo-fl2k allows to use USB 3.0 to VGA adapters based on the \
Fresco Logic FL2000 chip as general purpose DACs and SDR transmitter \
generating a continuous stream of samples by avoiding the HSYNC and \
VSYNC blanking intervals."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "osmo-fl2k-0.1.1+git.20200602-1.11.aarch64.rpm"
RPM_HASH = "eaf74b109a60d9c709cec57498982f34aef8330fb41bc6d43d2dd6528648ab792539fc8921c70c6d77295dd487263e9f77d41c046427f32714fc241594af4cec"

RPROVIDES:${PN} += "osmo-fl2k"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libosmo-fl2k.so.0"

inherit rpm
