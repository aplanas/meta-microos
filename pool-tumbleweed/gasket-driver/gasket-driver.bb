SUMMARY = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems"
DESCRIPTION = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems. \
The driver contains two modules: \
- Gasket (Google ASIC Software, Kernel Extensions, and Tools) is a top level driver \
  for lightweight communication with Google ASICs. \
- Apex refers to the EdgeTPU v1."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-1.0.18-2.2.aarch64.rpm"
RPM_HASH = "953c93d577ce4431916a5c6c6c78ea34949294c2f7f41c620c7551ead81b3122aa19a95bc28a34154845b235b793d3f6b09b1c0dbfa27e402ca697434a6f4e42"

RPROVIDES:${PN} += "gasket-driver \
group-apex"

RDEPENDS:${PN} += "/usr/bin/sh \
gasket-driver-kmp \
sysuser-shadow"

inherit rpm
