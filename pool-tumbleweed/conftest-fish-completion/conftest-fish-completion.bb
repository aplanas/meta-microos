SUMMARY = "Fish Completion for conftest"
DESCRIPTION = "Fish command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.45.0"

RPM_NAME = "conftest-fish-completion-0.45.0-1.1.noarch.rpm"
RPM_HASH = "094ddfdff06ce4f1f2b29f8040385286498239070278a481027a14bff1bee4c40f7f4d9eb46584e7acda5e6c51e1d800a79f2fce46b0bcaf79e854f6f94e000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-fish-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
