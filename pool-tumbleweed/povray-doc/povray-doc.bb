SUMMARY = "Documentation for POV-Ray"
DESCRIPTION = "This package contains the Povray documentation."
LICENSE = "AGPL-3.0-or-later & CC-BY-SA-3.0"

PV = "3.7.0.10"

RPM_NAME = "povray-doc-3.7.0.10-1.10.noarch.rpm"
RPM_HASH = "229ba1a22785d657f48aa0411531008b12275f17c5558f7164a7c7150a9528c82ff2b3057c9f353afb17c4327f9619998cc4889624a274ce4403a1e1ca6893ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "povray-doc"

RDEPENDS:${PN} += ""

inherit rpm
