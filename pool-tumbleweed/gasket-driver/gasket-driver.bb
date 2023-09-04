SUMMARY = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems"
DESCRIPTION = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems. \
The driver contains two modules: \
- Gasket (Google ASIC Software, Kernel Extensions, and Tools) is a top level driver \
  for lightweight communication with Google ASICs. \
- Apex refers to the EdgeTPU v1."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-1.0.18-2.5.aarch64.rpm"
RPM_HASH = "56dab4b1df46fc210b1c40c53868974d5fee77530afa601c197eedb8416d62d3d3bab3f2d52ad8fb4dfc2bd37d6ba7b1eba82292bc003ca20c3cbe4dad1031ea"

RPROVIDES:${PN} += "gasket-driver \
group-apex"

RDEPENDS:${PN} += "/usr/bin/sh \
gasket-driver-kmp \
sysuser-shadow"

inherit rpm
