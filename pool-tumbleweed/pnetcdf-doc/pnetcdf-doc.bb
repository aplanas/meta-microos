SUMMARY = "Documentation for pnetcdf"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the documentation for PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf-doc-1.12.3-1.3.noarch.rpm"
RPM_HASH = "2a1d2544a0766deb5a955bca46c447adb3c7f860c30fc8064a0e1c89d62051e92cc9b7d629ef65ece0c45e4b0708ae3c2df0f2e3943166f3058eb11964b9400a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
