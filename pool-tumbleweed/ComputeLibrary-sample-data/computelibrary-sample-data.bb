SUMMARY = "Compute Library sample data"
DESCRIPTION = "Free *.npy and *.ppm files to use with example binaries."
LICENSE = "MIT"

PV = "23.05"

RPM_NAME = "ComputeLibrary-sample-data-23.05-1.2.aarch64.rpm"
RPM_HASH = "3b3f7ce17db207590cd86c4678efda9ae842ea235b5929cfe8e266607110cbc3d94a879ded86bd8aa60bd3c790e0e82904125f7504f731456c141ae0e3072407"

RPROVIDES:${PN} += "ComputeLibrary-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
