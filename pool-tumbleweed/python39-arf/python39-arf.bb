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

RPM_NAME = "python39-arf-2.6.1-4.4.noarch.rpm"
RPM_HASH = "c303bbf42134796cf8bbce867761407feba8fb201029a4c803e2515c3e757cca1bd78975d3bc63ccd4d523009997f3fbd036706294bdeef0d9755cb99155597b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arf \
python39-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python39-h5py"

inherit rpm
