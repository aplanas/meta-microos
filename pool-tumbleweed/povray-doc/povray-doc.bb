SUMMARY = "Documentation for POV-Ray"
DESCRIPTION = "This package contains the Povray documentation."
LICENSE = "AGPL-3.0-or-later & CC-BY-SA-3.0"

PV = "3.7.0.10"

RPM_NAME = "povray-doc-3.7.0.10-1.8.noarch.rpm"
RPM_HASH = "7a5b0f075cc7c3e3f8a07a10fdf57c5d36b4668d5d41a37fce34f3afa7e11f7fd48ef50ab2505dc5d1fb0708c325ca26f537be7afb50a6bd5919ae81271601dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "povray-doc"

RDEPENDS:${PN} += ""

inherit rpm
