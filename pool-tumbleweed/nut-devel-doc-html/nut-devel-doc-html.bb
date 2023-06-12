SUMMARY = "Network UPS Tools - Documentation in HTML"
DESCRIPTION = "Developer manual in HTML format. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-devel-doc-html-2.8.0-2.1.noarch.rpm"
RPM_HASH = "1c249b22cae19a1ccca6701f809cff75f2e4cd5dbfa845883c1d285763c3de683b06660440d208edf5edd43b00b0c3a597dcef185c38fd25037e21282be4f63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-devel-doc-html"
RDEPENDS:${PN} += "nut-doc-html \
nut-doc-images"

inherit rpm
