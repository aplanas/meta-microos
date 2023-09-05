SUMMARY = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems"
DESCRIPTION = "The Coral Gasket Driver allows usage of the Coral EdgeTPU on Linux systems. \
The driver contains two modules: \
- Gasket (Google ASIC Software, Kernel Extensions, and Tools) is a top level driver \
  for lightweight communication with Google ASICs. \
- Apex refers to the EdgeTPU v1."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-1.0.18-2.6.aarch64.rpm"
RPM_HASH = "5509cb129459794882bc709bfa2136b98c57f9a9f5e7049683203ddb82f7920b6790bbf8cd5cfa231e4c6e74da7da93e0a0844b91b5331ae3221c0999f804265"

RPROVIDES:${PN} += "gasket-driver \
group-apex"

RDEPENDS:${PN} += "/usr/bin/sh \
gasket-driver-kmp \
sysuser-shadow"

inherit rpm
