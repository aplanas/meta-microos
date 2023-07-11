SUMMARY = "A Python library to use netCDF4 files via h5py"
DESCRIPTION = "A Python interface for the netCDF4 file-format that reads and writes \
local or remote HDF5 files directly via h5py or h5pyd, without \
relying on the Unidata netCDF library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python310-h5netcdf-1.1.0-1.5.noarch.rpm"
RPM_HASH = "f6de36398d5ea46ab3c94a1f70b08e9ef5fb8c13e446fa9005d2275bfd11d14037e1036dc4f80670ef9ed5973978427927f746395f66a3f8c046b5de69ca3a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-h5netcdf \
python310-h5netcdf \
python3dist-h5netcdf"

RDEPENDS:${PN} += "python-abi \
python310-h5py"

inherit rpm
