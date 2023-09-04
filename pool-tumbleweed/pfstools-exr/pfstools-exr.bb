SUMMARY = "EXR file import and export for PFS tools"
DESCRIPTION = "This package contains two-way conversion filters between the EXR file \
format and pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-exr-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "8787c12522fe9778890b63a7953a7fba5e710a310df61e006a2082b7877d3a9b9dec9dce53f81f2b19c2c86478d18b6e9d4d913455721e15da6613710ec7c7c0"

RPROVIDES:${PN} += "pfstools-exr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
