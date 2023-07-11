SUMMARY = "Freescale/NXP I.MX Chip image deploy tools"
DESCRIPTION = "Freescale/NXP I.MX Chip image deploy tools. This package holds the evolution of MFGTools (aka MFGTools v3), which is called the UUU (Universal Update Utility)."
LICENSE = "BSD-3-Clause"

PV = "1.4.243.7"

RPM_NAME = "mfgtools-1.4.243.7-2.2.aarch64.rpm"
RPM_HASH = "9b5cf21a6ea02929fb0ed3334b4676ba19224d631d8f4f155c826708c92abd291fb6daa30ea97f54b8e8707dfe79e8b6c952115ca2d8ce6903680b917f0e221d"

RPROVIDES:${PN} += "mfgtools"

RDEPENDS:${PN} += "libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
