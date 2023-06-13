SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-h5netcdf-1.1.0-1.3.noarch.rpm"
RPM_HASH = "f4004893f56f0ed75643537421a75a095f4bb3db2ecd8324d1114d93dd9784f2828e214d2296036e8560b569174037b478a8f53b3cf5b59d01c294f34928a607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(h5netcdf) \
python311-h5netcdf \
python3dist(h5netcdf)"

RDEPENDS:${PN} += "python(abi) \
python311-h5py"

inherit rpm
