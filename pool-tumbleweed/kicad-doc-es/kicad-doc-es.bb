SUMMARY = "Spanish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Spanish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-es-7.0.6-1.1.noarch.rpm"
RPM_HASH = "f38ee4405017d78ec1aff4b685d6a6f4484d75b46fe099a9f4652fa68208f3d60f1df5f7d6761b54651f0d98cf0632ede9eabf40e16a67ab91fefb54865114cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-es \
locale-kicad-doc-es"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
