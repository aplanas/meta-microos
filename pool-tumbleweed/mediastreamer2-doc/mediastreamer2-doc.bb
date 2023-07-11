SUMMARY = "Documentation for the mediastreamer2 library"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library. \
 \
This package contains documentation files"
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "mediastreamer2-doc-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "a26d6f1d70d5075f919b550c71ff27a16682fb7f504681cc2a7ee97b7b8ddab1daa0bf6b87c3a954b92cf8e2d942859edf5b22012b34209615dfb895ec230f02"

RPROVIDES:${PN} += "mediastreamer2-doc"

RDEPENDS:${PN} += "mediastreamer2"

inherit rpm
