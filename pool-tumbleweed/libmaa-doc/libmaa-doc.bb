SUMMARY = "Documentation files for libmaa"
DESCRIPTION = "This RPM contains the documentation files for libmaa."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "libmaa-doc-1.4.7-1.12.noarch.rpm"
RPM_HASH = "5eb5cb31eb58b798e915a12968724fd34727c6892697545b86a74035a853f6b9f3a4f754cd621fee946d7f539afb99db7361e620fdc64ea6e9087eaec7ae3eda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
