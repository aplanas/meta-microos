SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.9"

RPM_NAME = "python39-uproot-5.0.9-1.1.noarch.rpm"
RPM_HASH = "08daa436dc8f9c63c446b20464000c0324f9845756e1ff6a429cba03964c723c7db134b3fdcd9baea5491c70e63b3bb0f774ee27ea0e5d57320f4fb70585331b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uproot \
python39-uproot \
python3dist-uproot"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-packaging"

inherit rpm
