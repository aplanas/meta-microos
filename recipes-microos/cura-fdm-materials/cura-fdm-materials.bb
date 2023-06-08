SUMMARY = "FDM material database"
DESCRIPTION = "FDM material database for use with Cura"
LICENSE = "CC0-1.0"

PV = "4.13.0"

RPM_NAME = "cura-fdm-materials-4.13.0-1.5.noarch.rpm"
RPM_HASH = "c02f58220e5000df241e68ec1d8e201c7a424c83fd54b3717999bcf0ee60eb7ad8931c10471c4ed8a3938d4353886291edbbe65071dda1e2acebb9e8c88d49fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cura-fdm-materials"
RDEPENDS:${PN} += ""

inherit rpm
