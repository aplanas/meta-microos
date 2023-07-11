SUMMARY = "A set of tools to use with libsvm"
DESCRIPTION = "LIBSVM is an integrated software for support vector classification, \
(C-SVC, nu-SVC), regression (epsilon-SVR, nu-SVR) and distribution \
estimation (one-class SVM). It supports multi-class classification."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "svm-tools-3.30-1.6.aarch64.rpm"
RPM_HASH = "2e7237a53f43e6bd90b520d0358126d9984dfa0be8aeae3a934fd595f68714bc62ad39bb78896d7b4d9747fd2b01bed8f4eeb58a26716d159f82dfadeca3eef8"

RPROVIDES:${PN} += "svm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
