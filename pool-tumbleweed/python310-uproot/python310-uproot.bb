SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.7"

RPM_NAME = "python310-uproot-5.0.7-2.1.noarch.rpm"
RPM_HASH = "3ae2d89b3384c7417fafcc8465699634aed2bef74e81425f6282350d7a65f6a35ea907c34936ad593db884d17744618dbc44b2b17a1eb676c7559897e252fbec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uproot \
python3.10dist(uproot) \
python310-uproot \
python3dist(uproot)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-packaging"

inherit rpm
