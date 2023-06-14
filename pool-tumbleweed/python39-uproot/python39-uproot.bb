SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.7"

RPM_NAME = "python39-uproot-5.0.7-2.1.noarch.rpm"
RPM_HASH = "30ed5763a75198017fc64d126b23ca29410843440a243b3777a28289d438af14e6f093bba3260530b87bfe873071438b4790bcf2cbb7288fea4e7115738e6686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uproot \
python39-uproot \
python3dist-uproot"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-packaging"

inherit rpm
