SUMMARY = "Advanced Recording Format for physiology and behavior"
DESCRIPTION = "The Advanced Recording Format ARF is an open standard for storing \
data from neuronal, acoustic, and behavioral experiments in a \
portable, high-performance, archival format. The goal is to enable \
labs to share data and tools, and to allow data to be accessed and \
analyzed for many years in the future. \
 \
ARF is built on the the HDF5 format, and all arf files are accessible \
through standard HDF5 tools, including interfaces to HDF5 written for \
other languages (e.g. MATLAB, Python, etc). ARF comprises a set of \
specifications on how different kinds of data are stored."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "python311-arf-2.6.1-4.6.noarch.rpm"
RPM_HASH = "7e242ac943e711aad790dd8bea15cf4d6b95651583c44e2cd2fd2404a4a7acc2500626a352386f64453ed3c41728f799118014639261a29c4a02a3fcfd8a7e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arf \
python3.11dist-arf \
python311-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python311-h5py"

inherit rpm
