SUMMARY = "Documentation for Icecast"
DESCRIPTION = "Icecast is a MP3 and OGG streaming server able to serve many clients \
with MP3 and OGG audio. \
 \
This package contains the upstream HTML documentation and the sample \
configuration files from upstream."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "icecast-doc-2.4.4-2.9.noarch.rpm"
RPM_HASH = "86c3af75f3ea5aac5ae12398d17a54c36223237e782ecf391b09cbc3002522df9a861eddb63f8b1fc0635a2e06d82186fa1eb6d8b733bfaeb653aa5ce4909985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icecast-doc"
RDEPENDS:${PN} += ""

inherit rpm
