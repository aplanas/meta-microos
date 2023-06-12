SUMMARY = "Logos for openSUSE Tumbleweed"
DESCRIPTION = "Logos for openSUSE Tumbleweed"
LICENSE = "CC-BY-SA-4.0"

PV = "20220322"

RPM_NAME = "distribution-logos-openSUSE-Tumbleweed-20220322-1.5.noarch.rpm"
RPM_HASH = "7db2d9a4d325541da4bbb73a54711f2ca4c11ad5522b766001c45f445f9dce2c4fefed61e2777b93ca04bdb6aba372099c4ba190471b757cbf174193489e6092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Tumbleweed"
RDEPENDS:${PN} += ""

inherit rpm
