SUMMARY = "Upstream branding for deepin-launcher"
DESCRIPTION = "Upstream branding for deepin-launcher icon."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.31"

RPM_NAME = "deepin-launcher-branding-upstream-5.5.31-3.8.noarch.rpm"
RPM_HASH = "ded3db1f86651a0cfe531fb4c997a230837e273847912180af3454075950963246bfe4ce125801ecdad4c35107aff4bb47127a866190e77e116723e5e0afa613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-launcher-branding deepin-launcher-branding-upstream"
RDEPENDS:${PN} += "deepin-launcher"

inherit rpm
