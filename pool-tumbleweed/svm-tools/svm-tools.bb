SUMMARY = "A set of tools to use with libsvm"
DESCRIPTION = "LIBSVM is an integrated software for support vector classification, \
(C-SVC, nu-SVC), regression (epsilon-SVR, nu-SVR) and distribution \
estimation (one-class SVM). It supports multi-class classification."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "svm-tools-3.30-1.4.aarch64.rpm"
RPM_HASH = "290f57e2ec7fe4ba6dd6787f614cba87509a3d8877ec997a39a5f53ffab6944e0139440a5a797c4168ccc7cc23f11eea0459a6d13ad97ee652633b54c9f12eb8"

RPROVIDES:${PN} += "svm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
