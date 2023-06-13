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

RPM_NAME = "python311-arf-2.6.1-4.4.noarch.rpm"
RPM_HASH = "751051c91542fc7bf760327c9b2965b562bb542589aa3e774c75109a53db7059ec0050912e2debd2260b6c690e6bedd0f8f3673b39c7cfe7a50d8b4ca1a19a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(arf) \
python311-arf \
python3dist(arf)"

RDEPENDS:${PN} += "python(abi) \
python311-h5py"

inherit rpm
