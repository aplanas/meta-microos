SUMMARY = "openSUSE Tumbleweed branding for IceWM during the installation"
DESCRIPTION = "This IceWM theme is specifically tailored to the openSUSE installation \
process using YaST2"
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "84.87.20230227"

RPM_NAME = "icewm-theme-yast-installation-84.87.20230227-1.1.noarch.rpm"
RPM_HASH = "2efd9a2fa55be62daff4073cc2adeefcd5b9c847a70757bf92b7aca46ef42e73175b8da926b633f114b4b866dbe6642c62b7f0de98d8b88d440c0eed04a44cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(icewm-theme-yast-installation) \
icewm-theme-yast-installation"

RDEPENDS:${PN} += ""

inherit rpm
