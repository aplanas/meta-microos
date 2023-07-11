SUMMARY = "Documentaqtion for libtinyxml"
DESCRIPTION = "This packages contains the HTML documentation and a tutorial for \
libtinyxml"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "tinyxml-docs-2.6.2-10.9.aarch64.rpm"
RPM_HASH = "a3ce6cdaf95f5ddebba3797c0ccf8b89a838eb0670043209221158179b57fba8a72eaf33c4468a7b27c59a1a62cee98bee6c828c308507b334554e020f4fc0c3"

RPROVIDES:${PN} += "tinyxml-docs"

RDEPENDS:${PN} += "libtinyxml0"

inherit rpm
