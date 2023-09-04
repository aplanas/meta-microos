SUMMARY = "Japanese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Japanese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-ja-7.0.6-1.1.noarch.rpm"
RPM_HASH = "fa26c6bef7fceba9447a48a9ead1ed95710152385c22fe6b4015b7bd9ec7ad7c0f992f0213de869090c0beb922c331f8a670592e50bae75d2a2f1860578b248c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ja \
locale-kicad-doc-ja"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
