SUMMARY = "The SeaMonkey DOM Inspector"
DESCRIPTION = "This is a tool that allows you to inspect the DOM for web pages in \
SeaMonkey. This is of great use to people who are doing SeaMonkey \
chrome development or web page development."
LICENSE = "MPL-2.0"

PV = "2.53.17"

RPM_NAME = "seamonkey-dom-inspector-2.53.17-1.1.aarch64.rpm"
RPM_HASH = "05225eb21ff83589e4587f5a167eb4f99467d5af0904994ba6c9b94f261430778c357016804d25289507537f779d05bc64ef8f7a5cae8256fe13d8bc29b5df18"

RPROVIDES:${PN} += "seamonkey-dom-inspector"

RDEPENDS:${PN} += "seamonkey"

inherit rpm
