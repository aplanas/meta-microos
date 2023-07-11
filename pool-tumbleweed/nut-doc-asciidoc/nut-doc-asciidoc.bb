SUMMARY = "Network UPS Tools - Documentation in AsciiDoc Format"
DESCRIPTION = "NUT manuals in AsciiDoc format (human readable source). \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-asciidoc-2.8.0-3.1.noarch.rpm"
RPM_HASH = "2ec8e8968d8f0fe4f650ebd1bb3b3d69aca412494565ae72cb9a3fb1dc6a7b807fa27f71edfe667fb455967177765b0f40ee6904dd0b86b579255178c7df832c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-asciidoc"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
