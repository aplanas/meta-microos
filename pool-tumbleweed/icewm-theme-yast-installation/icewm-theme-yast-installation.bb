SUMMARY = "openSUSE Tumbleweed branding for IceWM during the installation"
DESCRIPTION = "This IceWM theme is specifically tailored to the openSUSE installation \
process using YaST2"
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "84.87.20230227"

RPM_NAME = "icewm-theme-yast-installation-84.87.20230227-2.1.noarch.rpm"
RPM_HASH = "defc751b97c9342a81790e752902cc4b2d832e7ea59bd04b347fe2934fc616382ea0b653f918a195664b006e34d5749895b6207706b21f995f98411f59fe5a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icewm-theme-yast-installation \
icewm-theme-yast-installation"

RDEPENDS:${PN} += ""

inherit rpm
