SUMMARY = "Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-2.10.0-2.5.noarch.rpm"
RPM_HASH = "22eb80ddad0f8ce7febc1c5b78ca83cb5f3ebf085f126ff45b3ca88972837680a5826fa6172da38a33720fcbef388d4a98426afe6bbe85180a347124b0565355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help \
gimp-help-2"
RDEPENDS:${PN} += "gimp"

inherit rpm
