SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python311-hdf5storage-0.1.19-1.3.aarch64.rpm"
RPM_HASH = "79f6680df43dee9b6aab22b4a3d4e0d10b88a922ed79d18d59fbac14708721980607de824768aba1fc51f9226612f43478b467ec29361e83901f959a4200974f"

RPROVIDES:${PN} += "python3-hdf5storage \
python3.11dist-hdf5storage \
python311-hdf5storage \
python3dist-hdf5storage"

RDEPENDS:${PN} += "python-abi \
python311-h5py \
python311-numpy"

inherit rpm
