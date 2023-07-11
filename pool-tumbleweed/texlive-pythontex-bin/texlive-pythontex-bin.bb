SUMMARY = "Binary files of pythontex"
DESCRIPTION = "Binary files of pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31638"

RPM_NAME = "texlive-pythontex-bin-2023.20230311.svn31638-92.1.aarch64.rpm"
RPM_HASH = "784a2f2d5eafc0ba3224f9df0e0fd6e11dd06e556a06ee6a79732abbadc4f2cefb36b6b217629f44b289eeb26cca4564576b3afad06e0f7423c38b5865e5afe4"

RPROVIDES:${PN} += "texlive-pythontex-bin"

RDEPENDS:${PN} += "texlive-pythontex"

inherit rpm
