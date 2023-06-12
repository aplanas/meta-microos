SUMMARY = "Development files for APE"
DESCRIPTION = "Development files for Monkey's Audio codec and decompressor."
LICENSE = "SUSE-Permissive"

PV = "8.92"

RPM_NAME = "mac-devel-8.92-1.2.noarch.rpm"
RPM_HASH = "7866cc53d0a7c3f340065d4a6b9f97b381b4d12247c0390a27b82f700ff0f0a9af50edc5886c0b9105602d0b932a2f301b51eaaefaee8ca113a3debbd5eb86f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mac-devel"
RDEPENDS:${PN} += "mac"

inherit rpm
