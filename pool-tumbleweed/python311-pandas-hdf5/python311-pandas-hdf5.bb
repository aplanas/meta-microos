SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-hdf5-2.0.3-1.2.noarch.rpm"
RPM_HASH = "13912d0e58072bd4d00821bb77c6b4d0c3f46963e54b9a4734aff82c568aebb9cd79929ff426729a7006b647a5d0fe4781dae7b9f73752550ba4e71fbd2ca4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-hdf5 \
python311-pandas-hdf5"

RDEPENDS:${PN} += "python311-blosc \
python311-pandas \
python311-tables"

inherit rpm
