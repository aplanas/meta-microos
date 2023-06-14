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

RPROVIDES:${PN} += "libkim-api-model-driver.so \
libkim-api-portable-model.so \
libkim-api-simulator-model.so \
openkim-models"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libkim-api.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
