SUMMARY = "Documentation for the Cairo C++ interface"
DESCRIPTION = "This package provides documentation for the Cairo C++ interface."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "cairomm1_0-doc-1.12.2-4.4.aarch64.rpm"
RPM_HASH = "dabeef2669981a4d8d01156a01c1083560a07b210fdf44087b1e2486a45e99dcf5c768826085b3181d0e822e6303ece1255adb3c0547e800faad6fd9577bc272"

RPROVIDES:${PN} += "cairomm1-0-doc"

RDEPENDS:${PN} += ""

inherit rpm
