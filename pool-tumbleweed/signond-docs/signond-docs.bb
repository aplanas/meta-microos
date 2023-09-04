SUMMARY = "Single Sign On Framework - Documentation"
DESCRIPTION = "This package contains the documentation for signond."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-docs-8.61-1.1.noarch.rpm"
RPM_HASH = "bfc73282d8d56fcbd88e30df423f384e432311da6aba1f9f86cf1dea0d4a6e03bbeb178d1c164e0d6bf0c0704ab0aeca5488624a595485bfe60fe0bbec0688ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "signond-docs"

RDEPENDS:${PN} += ""

inherit rpm
