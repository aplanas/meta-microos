SUMMARY = "Python bindings for libsvm"
DESCRIPTION = "This package contains the Python bindings for libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "python311-svm-3.30-1.6.noarch.rpm"
RPM_HASH = "53b092522ea6f33ecbad6486aa63be0dec6574b4f757e60eb07d8414a16cb2ae194cb23b1d94eafd3d089e6faf80a4040be495aaf51df490e5f5b40053db922e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-svm \
python311-svm"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
gnuplot \
python-abi \
svm-tools"

inherit rpm
