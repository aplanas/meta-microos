SUMMARY = "YaST2 - Oxygen icon theme"
DESCRIPTION = "Contains icons in KDE Oxygen style (from KDE Plasma 4)."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-theme-oxygen-4.6.0-1.2.noarch.rpm"
RPM_HASH = "6269d980d4b4255f3babe2a8fa0a869811e525a09676d002cf03a40a8ce1c7c22e801854968cc8cd2f4748b8af5fb7e1061b114b31b6156756e23e24b3996779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-theme-oxygen"

RDEPENDS:${PN} += "oxygen5-icon-theme \
yast2-branding"

inherit rpm
