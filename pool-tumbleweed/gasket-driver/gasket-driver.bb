SUMMARY = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems"
DESCRIPTION = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems. \
The driver contains two modules: \
- Gasket (Google ASIC Software, Kernel Extensions, and Tools) is a top level driver \
  for lightweight communication with Google ASICs. \
- Apex refers to the EdgeTPU v1."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-1.0.18-1.7.aarch64.rpm"
RPM_HASH = "4b04656640fc0c847b6ec3d43ffde3de797c72eefe131547925c04aabfa3aad0a023bbc6993b97de037a75467e99eb2691694c856e36455e1f781b322f60a1a1"

RPROVIDES:${PN} += "gasket-driver \
group-apex"

RDEPENDS:${PN} += "/usr/bin/sh \
gasket-driver-kmp \
sysuser-shadow"

inherit rpm
