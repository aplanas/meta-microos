SUMMARY = "Contrib scripts for Neomutt"
DESCRIPTION = "Examples, scripts and helpers that are distributed with Neomutt but are not \
maintained by the Neomutt authors."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-contrib-20230517-1.2.noarch.rpm"
RPM_HASH = "c06716053090a84817ba2377903bcb4f8e06fe022f1f3420ae0d17bd20687711c49659c4c6d3ea35579d2a1989c5d6c9f7fb6884745734342a768f9b53c5de82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-contrib"

RDEPENDS:${PN} += "/usr/bin/env \
neomutt"

inherit rpm
