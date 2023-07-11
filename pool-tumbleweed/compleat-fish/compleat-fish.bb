SUMMARY = "Files to use compleat in the fish shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the fish shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-fish-1.0+git.20220402.ec8fccc-1.9.noarch.rpm"
RPM_HASH = "b74cccc999672b376c324521fb92e5687bd107eb33aa97b105f111d287ab15feb97f56a74897e5ec7d8c6647237e4d57a3f15a91bf42ea98332185cc885d5562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-fish"

RDEPENDS:${PN} += "compleat"

inherit rpm
