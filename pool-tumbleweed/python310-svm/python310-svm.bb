SUMMARY = "Python bindings for libsvm"
DESCRIPTION = "This package contains the Python bindings for libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "python310-svm-3.30-1.4.noarch.rpm"
RPM_HASH = "266fa05a61c22db16f5a266b738be5c8dda8850ea6efbc1f8d2244d30e5700897e54e7400a09def47aeb35c834078425a16826b3a17b16bffc3515cd879c4ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-svm \
python310-svm"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
gnuplot \
python(abi) \
svm-tools"

inherit rpm
