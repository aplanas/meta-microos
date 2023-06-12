SUMMARY = "Network UPS Tools - Documentation in AsciiDoc Format"
DESCRIPTION = "NUT manuals in AsciiDoc format (human readable source). \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-asciidoc-2.8.0-2.1.noarch.rpm"
RPM_HASH = "f4fbaa53440759de8e5e2794f25ac37476d44ee6cc0a90dcdb79ff095936f4a7c8803af0cd76d2c8fbacee9736e8aa6ec1a47a85892f5fcf4f31a37e86fff3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-asciidoc"
RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
