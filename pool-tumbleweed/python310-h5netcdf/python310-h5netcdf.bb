SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-h5netcdf-1.1.0-1.3.noarch.rpm"
RPM_HASH = "5bd30978f8818c47d54e1227b52c8c210ea49f02bc7e58a54c1c931cc33f3ecf8e123b6d20005d8902360f162892e0d91a691fd68f452bfd907ba2ed343c7dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h5netcdf \
python3.10dist(h5netcdf) \
python310-h5netcdf \
python3dist(h5netcdf)"
RDEPENDS:${PN} += "python(abi) \
python310-h5py"

inherit rpm
