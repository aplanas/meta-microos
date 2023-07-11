SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.9"

RPM_NAME = "python310-uproot-5.0.9-1.1.noarch.rpm"
RPM_HASH = "99a7047903f375b2f46bc2b4353751b653c0ab706b307c619cc90fc53f2f089fc7b30b2feeeee04616a84fbf194f979333324388bcce30292782aa827a662ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uproot \
python310-uproot \
python3dist-uproot"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-packaging"

inherit rpm
