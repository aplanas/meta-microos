SUMMARY = "HDF5 I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
HDF5 files."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "spyder-hdf5-5.4.3-1.2.noarch.rpm"
RPM_HASH = "a7cb783a96a5c5654a50c3b5eff1546bf62d7f832bb93123a049973669418c6c90fad827216593740923c757bedac3cc601151141ea0a6ea8d6b353c8773eeeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-hdf5 \
spyder3-hdf5"

RDEPENDS:${PN} += "python-abi \
python3-h5py \
spyder"

inherit rpm
