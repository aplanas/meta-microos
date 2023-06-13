SUMMARY = "openSUSE configuration for container-build-checks"
DESCRIPTION = "openSUSE configuration for container-build-checks"
LICENSE = "GPL-2.0-or-later"

PV = "1682595397.5ce6d2f"

RPM_NAME = "container-build-checks-vendor-openSUSE-1682595397.5ce6d2f-1.1.noarch.rpm"
RPM_HASH = "a46e6187c1bc3337268bc007f814ceac36a16892057e8eeef1b8ec174353833778c8cffa1b814327f0e6428b5cea24538ae9e9c6acd8d0d4db4d11f354880545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks-vendor \
container-build-checks-vendor-openSUSE"

RDEPENDS:${PN} += "container-build-checks"

inherit rpm
