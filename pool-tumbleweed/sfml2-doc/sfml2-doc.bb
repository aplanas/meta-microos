SUMMARY = "SFML developer documentation"
DESCRIPTION = "SFML is a multimedia API that provides access to graphics, input, \
audio, etc. similar to SDL. \
 \
This subpackage contains the developer documentation."
LICENSE = "Zlib"

PV = "2.6.0"

RPM_NAME = "sfml2-doc-2.6.0-1.1.noarch.rpm"
RPM_HASH = "5f47abbd06fd95f3e717a61c13ecdcd4e549e18f70b1f429380fb09dde3325deb24c394822726f890f3b7754ecbe746babef091ad3dbb9c0652d6564ef171d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sfml2-doc"

RDEPENDS:${PN} += ""

inherit rpm
