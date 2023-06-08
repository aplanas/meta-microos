SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "Source Sans is a set of OpenType fonts that have been designed to work well in user interface (UI) environments, as well as in text setting for screen and print."
LICENSE = "OFL-1.1"

PV = "2.045"

RPM_NAME = "adobe-sourcesanspro-fonts-2.045-2.6.noarch.rpm"
RPM_HASH = "2129c94c4ddd3436d8c406f161fcb38cb9fbb11d8e622cdff24ac100674bc35c92d072c9c09f1f4a6f064cfe3c96a84fa424766d6ef668359487179fec2a2074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcesanspro-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
