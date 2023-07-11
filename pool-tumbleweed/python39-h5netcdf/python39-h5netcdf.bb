SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python39-h5netcdf-1.1.0-1.5.noarch.rpm"
RPM_HASH = "b8790fd8b06d51d8fc24f18798c416faaf348b540cc8184546a62ee237d404393045fdf1bbd3ee135996e9d47dd93da5546c410a67d1bda7916a5adbe08074af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-h5netcdf \
python39-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python39-h5py"

inherit rpm
