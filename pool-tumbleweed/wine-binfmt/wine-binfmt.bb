SUMMARY = "The binfmt_misc support for Windows"
DESCRIPTION = "Run Windows(tm) executables out of the box."
LICENSE = "GPL-2.0"

PV = "1.2.1"

RPM_NAME = "wine-binfmt-1.2.1-1.2.noarch.rpm"
RPM_HASH = "3cd313d3e33ce790396066ae8d5050a4906a71375da158b3412601fd07365a7ad49b4e598673b2c5a32c77666066ee3c1be985dd1144a053a2a5f31e4a6187da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-binfmt"
RDEPENDS:${PN} += "/bin/sh \
systemd \
wine"

inherit rpm
