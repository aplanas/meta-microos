SUMMARY = "Documentation for Icecast"
DESCRIPTION = "Icecast is a MP3 and OGG streaming server able to serve many clients \
with MP3 and OGG audio. \
 \
This package contains the upstream HTML documentation and the sample \
configuration files from upstream."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "icecast-doc-2.4.4-2.10.noarch.rpm"
RPM_HASH = "55c7b8803eaee5a9d762ff22f6cad1b44b67608027825c39932eefec06eb5637bb0c1f82c03e4f409e372057198b881a716b56438eaa1d428863f4ac311259b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icecast-doc"

RDEPENDS:${PN} += ""

inherit rpm
