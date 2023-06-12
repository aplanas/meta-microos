SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "breeze-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "052cfd2ae2844214f4f1b451a2d9a0b874c067b3b3361af38162d5f3834e39552191e8cad5a50883cc11acc49bc323ceaebd8fb36594bcdc5e9fa342a65e6811"

RPROVIDES:${PN} += "breeze \
breeze(aarch-64)"
RDEPENDS:${PN} += "breeze5-cursors \
breeze5-icons \
breeze5-style"

inherit rpm
