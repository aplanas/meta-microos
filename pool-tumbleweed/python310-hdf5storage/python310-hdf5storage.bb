SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python310-hdf5storage-0.1.19-1.1.aarch64.rpm"
RPM_HASH = "07de46dd35b06a1c8b8352f300a50b822cac77ad5bb54c262b1bade4264d5a3be85e733f54ac87cdd4e2f81abc3599891ec875b70b1c883951286c07d34252fc"

RPROVIDES:${PN} += "python3-hdf5storage \
python3.10dist(hdf5storage) \
python310-hdf5storage \
python310-hdf5storage(aarch-64) \
python3dist(hdf5storage)"

RDEPENDS:${PN} += "python(abi) \
python310-h5py \
python310-numpy"

inherit rpm
