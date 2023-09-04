SUMMARY = "Russian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Russian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-ru-7.0.6-1.1.noarch.rpm"
RPM_HASH = "53c47615aef37cd016ff628d998e8dd1b49bfc3199e50ae2aacd646268b41c6529ec25654b0422c29c248e9e9d072755a6351131f77ac8ff3cac25d56ba2a00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ru \
locale-kicad-doc-ru"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
