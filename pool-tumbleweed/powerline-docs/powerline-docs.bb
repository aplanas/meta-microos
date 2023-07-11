SUMMARY = "Documentation for powerline"
DESCRIPTION = "This package provides the powerline documentation."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "powerline-docs-2.8.3-3.1.noarch.rpm"
RPM_HASH = "e62fe18ea0b76bbfa2800e9d9a275b5e2b4e46400ef7ecaa70e2ea68c3056725cdb0ec1ad9026a1c5f5c0201d5b5f72c0a08533e20d0901a4e00ae9575e0f1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerline-docs"

RDEPENDS:${PN} += ""

inherit rpm
