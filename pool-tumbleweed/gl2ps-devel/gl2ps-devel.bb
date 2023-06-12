SUMMARY = "Development files for GL2PS"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using GL2PS."
LICENSE = "LGPL-2.0-or-later | SUSE-GL2PS-2.0"

PV = "1.4.2"

RPM_NAME = "gl2ps-devel-1.4.2-1.12.aarch64.rpm"
RPM_HASH = "a8a7403de89528ef2742bd0b32b7d4c3b3cca1eab8a7faac099655fb2559683b00a224ee8cd2f2056cbf0e40a32d140d14aa6f3a4fdf6a965d45cf78dd0288cc"

RPROVIDES:${PN} += "gl2ps-devel \
gl2ps-devel(aarch-64)"
RDEPENDS:${PN} += "libgl2ps1"

inherit rpm
