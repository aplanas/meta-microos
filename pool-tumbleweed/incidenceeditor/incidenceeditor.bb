SUMMARY = "Incidenceeditor library"
DESCRIPTION = "This package contains the incidenceeditor library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "incidenceeditor-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "abf235503b0e35c80deee3f8b44b011409322a0370dcecf0d272de1055761404e051dd6d610503619831d75b7f7071c72acb700a11c9d52ca3e239c4e595ec1a"

RPROVIDES:${PN} += "incidenceeditor"

RDEPENDS:${PN} += ""

inherit rpm
