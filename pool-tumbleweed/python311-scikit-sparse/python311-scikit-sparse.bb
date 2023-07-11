SUMMARY = "Scikits sparse matrix package"
DESCRIPTION = "Sparse matrix tools. \
 \
This is a sparse matrix code in Python that plays well with \
scipy.sparse, but that is somehow unsuitable for inclusion in scipy \
proper. \
 \
There is a wrapper for the CHOLMOD library for sparse Cholesky \
decomposition."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.5"

RPM_NAME = "python311-scikit-sparse-0.4.5-1.14.aarch64.rpm"
RPM_HASH = "1c742a9e4021b0b123a9860bfcc5207ae43ce78234479bcc1c808127eaa5065ed68c6e927fd8b53adc1e4864b88a4fc2d14ce96ff0a44935a7afa4c4718f7f2d"

RPROVIDES:${PN} += "python3-scikit-sparse \
python3.11dist-scikit-sparse \
python311-scikit-sparse \
python3dist-scikit-sparse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcholmod.so.3 \
python-abi \
python311-numpy \
python311-scipy"

inherit rpm
