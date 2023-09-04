SUMMARY = "The python pandas[performance] extra"
DESCRIPTION = "This package provides the [performance] extra for python-pandas \
 \
It is highly recommended to install this subpackage, as its dependencies \
provide speed improvements, especially when working with large data sets."
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-performance-2.0.3-1.2.noarch.rpm"
RPM_HASH = "2d0feba3c9d130be9f7afae3f12f96594057fd38fa61d69fb73b3a0f5f1fb726c6443a2bfcca81da881a0ba02e4c528eabaef9194f3c8eb6abf3ed34ebbdd7c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-performance \
python311-pandas-performance"

RDEPENDS:${PN} += "python311-Bottleneck \
python311-numba \
python311-numexpr \
python311-pandas"

inherit rpm
