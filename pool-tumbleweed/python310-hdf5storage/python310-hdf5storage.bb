SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python310-hdf5storage-0.1.19-1.3.aarch64.rpm"
RPM_HASH = "0152711b3d9a8fc94363f157408a91614a79bf90390a4b6d8fa832402edca68ff329e8e0d0fff9eb2d47a5a988c781a0fbc9bd0955fe98288f88aad9e9d9cad2"

RPROVIDES:${PN} += "python3.10dist-hdf5storage \
python310-hdf5storage \
python3dist-hdf5storage"

RDEPENDS:${PN} += "python-abi \
python310-h5py \
python310-numpy"

inherit rpm
