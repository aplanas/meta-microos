SUMMARY = "HDF5 I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
HDF5 files."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "spyder-hdf5-5.4.3-1.1.noarch.rpm"
RPM_HASH = "dae370844c777980c257b4cbadd777337c6f07eac63039299990e6ef367a577f7365b8b42d84e6f79bdd8a1cdb808f42131dc65bc04ecd7d3ba0bd968fbc3e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-hdf5 \
spyder3-hdf5"

RDEPENDS:${PN} += "python-abi \
python3-h5py \
spyder"

inherit rpm
