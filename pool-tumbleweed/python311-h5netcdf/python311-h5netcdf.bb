SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-h5netcdf-1.1.0-1.5.noarch.rpm"
RPM_HASH = "6b56dfabcd5ebd75d8cca90bfbcaee435319712626a84375227ae5979aabce84a254395e09fa163ed18a21572a1769a566d8793952a9fe341472914ec8a1cb8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h5netcdf \
python3.11dist-h5netcdf \
python311-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python311-h5py"

inherit rpm
