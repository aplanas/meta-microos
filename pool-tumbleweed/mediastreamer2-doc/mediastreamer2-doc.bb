SUMMARY = "Documentation for the mediastreamer2 library"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library. \
 \
This package contains documentation files"
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "mediastreamer2-doc-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "ff388da4d5d471a846a58790a344505eb60ac3bef300ad985d7be88c15a95796ad31293bb2e10a8972a150c88621bad8e81bdd4393589ade3d46c7c071218834"

RPROVIDES:${PN} += "mediastreamer2-doc"

RDEPENDS:${PN} += "mediastreamer2"

inherit rpm
