SUMMARY = "Documentation for GLM library"
DESCRIPTION = "This package provides the documentation for GLM library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.9.9.8"

RPM_NAME = "glm-doc-0.9.9.8-2.8.noarch.rpm"
RPM_HASH = "d5d0135929f4a0228a06bab45f03a70c53ac1b503f11155a7aa36a2cc9800ca7332bec5352f0ff21e872e8a82760b0dcb8283ca3f67e1d74afc88b702cda6715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glm-doc"

RDEPENDS:${PN} += ""

inherit rpm
