SUMMARY = "Documentation on luaposix"
DESCRIPTION = "This package contains the documentation for lua54-luaposix."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "luaposix-doc-35.1-2.3.noarch.rpm"
RPM_HASH = "ccc5648d1caf895e24173f1e526025b4fe8a29e80bdc5f0a9054cec23a5ff4ae13e1f04908821f90d8c6ea3e9cc23af29af75a41ae24bbe341ea254e8afe0326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luaposix-doc"

RDEPENDS:${PN} += ""

inherit rpm
