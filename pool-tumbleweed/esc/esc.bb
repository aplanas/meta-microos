SUMMARY = "Embeds files into go programs"
DESCRIPTION = "esc embeds files into go programs and provides http.FileSystem interfaces to them."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "esc-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "83ecd768615e11ebfb089d6849fa21b719c73cd979c431b70836a175e627091755e38fa328f112b3522036d3d57af96829d243d22bb18322625d0d04337e62ba"

RPROVIDES:${PN} += "esc \
esc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
