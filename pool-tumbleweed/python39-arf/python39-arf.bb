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

RPM_NAME = "python39-arf-2.6.1-4.6.noarch.rpm"
RPM_HASH = "fda64d257e3cc532586eebe2c6a2b55bd94ecb7f3e7d487a63ca26764a9f926ba849c9971382663b8d8469022fdcf8f35a51dcde2e96e5d4938c45f3665d75ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arf \
python39-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python39-h5py"

inherit rpm
