SUMMARY = "ROOT I/O in pure Python and Numpy"
DESCRIPTION = "Uproot is a reader and a writer of the ROOT file format using only Python and \
Numpy. Unlike the standard C++ ROOT implementation, Uproot is only an I/O \
library, primarily intended to stream data into machine learning libraries in \
Python. It uses Numpy to cast blocks of data from the ROOT file as Numpy \
arrays."
LICENSE = "BSD-3-Clause"

PV = "5.0.9"

RPM_NAME = "python311-uproot-5.0.9-1.1.noarch.rpm"
RPM_HASH = "c82ca9d9af316a548635fb317970dca69168b759c6d3056fe94cc1aca84d74dc544a48ab35b663dc74171587bfd9a5f4787f7bb5923b661508132e3a4d2b8147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uproot \
python3.11dist-uproot \
python311-uproot \
python3dist-uproot"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-packaging"

inherit rpm
