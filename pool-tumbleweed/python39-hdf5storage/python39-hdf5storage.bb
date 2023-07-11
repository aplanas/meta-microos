SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python39-hdf5storage-0.1.19-1.3.aarch64.rpm"
RPM_HASH = "080263c40ae637a30e7312a2baf6e5a849e633d9a91e3a205aba379fa6b0f6d2694fc74462679f8d7ade5322c7004a840117275de8036f01ada908608703b625"

RPROVIDES:${PN} += "python3.9dist-hdf5storage \
python39-hdf5storage \
python3dist-hdf5storage"

RDEPENDS:${PN} += "python-abi \
python39-h5py \
python39-numpy"

inherit rpm
