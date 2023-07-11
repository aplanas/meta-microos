SUMMARY = "XMLTooling schemas and catalog"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package includes XML schemas and related files."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "xmltooling-schemas-3.2.4-1.1.noarch.rpm"
RPM_HASH = "16fe423d8b5d9e56bde63b03032246188bc51aadccd393f11186bdae69ad99b54ffa070b899098b82a06ad6af0a2d83c4a17e09330710616b748a8cb7f4ae111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmltooling-schemas"

RDEPENDS:${PN} += ""

inherit rpm
