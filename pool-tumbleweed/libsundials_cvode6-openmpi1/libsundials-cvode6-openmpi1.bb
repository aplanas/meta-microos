SUMMARY = "Suite of nonlinear solvers - cvode shared libraries"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides the shared libraries for SUNDIALS' cvode solver."
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "libsundials_cvode6-openmpi1-6.3.0-2.4.aarch64.rpm"
RPM_HASH = "ef7908109aea027917fea59335e414c7437cb16a1d6114a32c6d7b4de42ba25ede45bea0d001fc0053eec17034d81e9035631ed1ea35a273229be18113585684"

RPROVIDES:${PN} += "libsundials_cvode.so.6()(64bit) \
libsundials_cvode6-openmpi1 \
libsundials_cvode6-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
