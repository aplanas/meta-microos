SUMMARY = "KIWI - openSUSE Tumbleweed Minimal image templates"
DESCRIPTION = "This package contains system image templates to easily build \
a openSUSE Tumbleweed based operating system image with \
kiwi."
LICENSE = "MIT"

PV = "84.87.1"

RPM_NAME = "kiwi-templates-Minimal-84.87.1-7.1.noarch.rpm"
RPM_HASH = "5a31729f97f2b88504d7b68271a2eaa3306285036454daac001e9b851c9c937133bd5fd60787c43023125df66c69ebedc5ede8b9a371b27a10e67ef9b16c6359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiwi-templates-JeOS \
kiwi-templates-Minimal"

RDEPENDS:${PN} += "python3-kiwi"

inherit rpm
