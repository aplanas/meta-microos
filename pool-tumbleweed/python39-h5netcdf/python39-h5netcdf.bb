SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-h5netcdf-1.1.0-1.3.noarch.rpm"
RPM_HASH = "f036978262cacddaa8382453a5e029866c184ec795b3f290c4df5a1424d8c5d610f92358a63c84e8516f8834c639b4d2bc317ea92ef17796eb74a9fed0f8936f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(h5netcdf) \
python39-h5netcdf \
python3dist(h5netcdf)"
RDEPENDS:${PN} += "python(abi) \
python39-h5py"

inherit rpm
