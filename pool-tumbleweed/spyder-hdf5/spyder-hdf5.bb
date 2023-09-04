SUMMARY = "HDF5 I/O plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin that allows Spyder to read and write \
HDF5 files."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "spyder-hdf5-5.4.4-1.1.noarch.rpm"
RPM_HASH = "8cdb5279628b6e2b2e843678c0feafa29403304931242be37e51ba6a6c3b184d55a667f340a5cd65d4d90ce4ed1846c21ae8de6ded5a83491bd0ed67a5578497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spyder-hdf5 \
spyder3-hdf5"

RDEPENDS:${PN} += "python-abi \
python3-h5py \
spyder"

inherit rpm
