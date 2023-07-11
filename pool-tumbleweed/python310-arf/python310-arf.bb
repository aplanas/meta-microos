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

RPM_NAME = "python310-arf-2.6.1-4.6.noarch.rpm"
RPM_HASH = "f62ac4f44e8d748cc1ba71868f4134caab6989c16447245e58fc55fe8d1349af887d590fca4ae345bfad142b26691ff4dffa9731040f73502d7499a92aa0df29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arf \
python310-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python310-h5py"

inherit rpm
