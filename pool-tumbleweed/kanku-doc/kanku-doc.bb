SUMMARY = "Documentation files for kanku"
DESCRIPTION = "This package contains the documentation files for kanku."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-doc-0.14.0-1.5.noarch.rpm"
RPM_HASH = "bc8958230e2f96497e67d1efca58ea09a8915399b7d784fd856404d7998a0151b34cc78c725bd53499f9a376e53f9a6f477ce0317744643a54e2caa66d7fe8fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-doc"

RDEPENDS:${PN} += ""

inherit rpm
