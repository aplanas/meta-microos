SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy_1_24_2-gnu-hpc-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "9bf6c302749ac264ebf48f5ebd5188df3408d60c8c5c0de3062bc49f7b2ae98096c2f93fdfd027bdd4c98d97259ace42d0d5410d01fb37b60c0b5197addd5b72"

RPROVIDES:${PN} += "python39-numpy-1-24-2-gnu-hpc-devel"

RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel \
python-abi \
python39-devel \
python39-numpy-1-24-2-gnu-hpc"

inherit rpm
