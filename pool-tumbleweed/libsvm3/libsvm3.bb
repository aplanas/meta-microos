SUMMARY = "A Library for Support Vector Machines"
DESCRIPTION = "LIBSVM is an integrated software for support vector classification, \
(C-SVC, nu-SVC), regression (epsilon-SVR, nu-SVR) and distribution \
estimation (one-class SVM). It supports multi-class classification."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "libsvm3-3.30-1.6.aarch64.rpm"
RPM_HASH = "04fa36d56fcc03db0754487e04db62777dd8a6ee9b5ed160fb3b5b4e2c696a98d955ab25ea8e6e9b98df3ebf381cc5624c5e7071327675ff0744132673910c4f"

RPROVIDES:${PN} += "libsvm.so.3 \
libsvm3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
