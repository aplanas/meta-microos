SUMMARY = "Additional colors for lite-xl"
DESCRIPTION = "Color themes for the Lite XL text editor, originally forked from the lite colors repository."
LICENSE = "MIT"

PV = "git20230412.000e6aa"

RPM_NAME = "lite-xl-colors-git20230412.000e6aa-1.1.noarch.rpm"
RPM_HASH = "f4385004b6990b1e746d07c59a8a0e4cf74a48bb48a2e46e64e2da82012453429e01d6e331d60871ffbdcf61f75255971ec8d02c2a97a4d235b2f91e2edc6d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lite-xl-colors"

RDEPENDS:${PN} += "lite-xl"

inherit rpm
