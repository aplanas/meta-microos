SUMMARY = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems"
DESCRIPTION = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems. \
The driver contains two modules: \
- Gasket (Google ASIC Software, Kernel Extensions, and Tools) is a top level driver \
  for lightweight communication with Google ASICs. \
- Apex refers to the EdgeTPU v1."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-1.0.18-1.3.aarch64.rpm"
RPM_HASH = "17f0e167a1dc65840ff9ef76ce263913256edf8753b885cb4ee06b14459f126d851029023c9b6674024287d0fcc8eb19b77a78391ba32aa644bf7ba8db6a17b9"

RPROVIDES:${PN} += "gasket-driver \
gasket-driver(aarch-64) \
group(apex)"

RDEPENDS:${PN} += "/bin/sh \
gasket-driver-kmp \
sysuser-shadow"

inherit rpm
