SUMMARY = "Open Knowledgebase of Interatomic Models"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the models from openkim.org."
LICENSE = "Apache-2.0 & CDDL-1.0 & MPL-2.0 & GPL-3.0-only & LGPL-3.0-only"

PV = "2021.08.11"

RPM_NAME = "openkim-models-2021.08.11-1.6.aarch64.rpm"
RPM_HASH = "f80a6ffd8a8050d9fea56db93c3c3ba19a041a5665228c94711231aaabb9231671603eb3353664ec07253e75670dc696d998373778741214728f99cf719a714e"

RPROVIDES:${PN} += "libkim-api-model-driver.so()(64bit) \
libkim-api-portable-model.so()(64bit) \
libkim-api-simulator-model.so()(64bit) \
openkim-models \
openkim-models(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libkim-api.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
