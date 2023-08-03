SUMMARY = "Manual pages for cmake, a cross-platform make system"
DESCRIPTION = "Manual pages for cmake, a cross-platform make system."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-man-3.27.1-1.2.aarch64.rpm"
RPM_HASH = "eb05dae6fadd11f9cbd41f0deeb52e348b4213157aa1e3b0e102332b17db8caa1b6304aab4f407e6aca9f51b04a50f20c22f7cc8366301ae09dc099a66571037"

RPROVIDES:${PN} += "cmake-man"

RDEPENDS:${PN} += ""

inherit rpm
