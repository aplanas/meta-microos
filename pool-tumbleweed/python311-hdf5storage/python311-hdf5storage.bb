SUMMARY = "Utilities to read/write HDF5 files, including MATLAB v7.3 MAT files"
DESCRIPTION = "This Python package provides high level utilities to read/write a \
variety of Python types to/from HDF5 (Heirarchal Data Format) formatted \
files. This package also provides support for MATLAB MAT v7.3 formatted \
files, which are just HDF5 files with a different extension and some \
extra meta-data."
LICENSE = "BSD-3-Clause"

PV = "0.1.19"

RPM_NAME = "python311-hdf5storage-0.1.19-1.1.aarch64.rpm"
RPM_HASH = "5ee3f7d57bbeb320afcdc90052f80dcf40328b8cdff767b3f277af27e4b771f02490d7a261dbe313a953454fa82cbd04f1c0cd12f44e518f2284604a4dab746e"

RPROVIDES:${PN} += "python3.11dist(hdf5storage) \
python311-hdf5storage \
python311-hdf5storage(aarch-64) \
python3dist(hdf5storage)"

RDEPENDS:${PN} += "python(abi) \
python311-h5py \
python311-numpy"

inherit rpm
