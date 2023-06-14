SUMMARY = "A Library for Support Vector Machines"
DESCRIPTION = "LIBSVM is an integrated software for support vector classification, \
(C-SVC, nu-SVC), regression (epsilon-SVR, nu-SVR) and distribution \
estimation (one-class SVM). It supports multi-class classification."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "libsvm3-3.30-1.4.aarch64.rpm"
RPM_HASH = "dee4c00c21936e597585ac16a1b80a3c94351811cbb4a6cdd49d401c024a5944dc250271e2b8690bd86dd15bf29f87f06ee0766d659bf455ee57f990a73d5011"

RPROVIDES:${PN} += "libsvm.so.3 \
libsvm3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
