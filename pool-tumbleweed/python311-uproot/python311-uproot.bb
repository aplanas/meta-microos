SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.7"

RPM_NAME = "python311-uproot-5.0.7-2.1.noarch.rpm"
RPM_HASH = "9b0ac9f4632a8fc3e51708755324cd7983a084146a2cbab5130e0a16863487c0f64286331b799b2e8170d58d3669a3fde2578e2defcf4828a5c19d46717ab6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uproot) \
python311-uproot \
python3dist(uproot)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-packaging"

inherit rpm
