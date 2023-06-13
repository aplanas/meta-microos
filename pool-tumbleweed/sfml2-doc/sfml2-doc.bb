SUMMARY = "SFML developer documentation"
DESCRIPTION = "SFML is a multimedia API that provides access to graphics, input, \
audio, etc. similar to SDL. \
 \
This subpackage contains the developer documentation."
LICENSE = "Zlib"

PV = "2.5.1"

RPM_NAME = "sfml2-doc-2.5.1-1.20.noarch.rpm"
RPM_HASH = "2f30088c30a2706c3d13ecfabfdc6b09d1149dd08830d4195c0236e95b1c7c63b3ca3cffe2143424071fc43d089d5771f45031d0b6a18b842fd4fa29e7b3a554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sfml2-doc"

RDEPENDS:${PN} += ""

inherit rpm
