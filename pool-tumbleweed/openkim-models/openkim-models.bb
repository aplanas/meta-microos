SUMMARY = "Open Knowledgebase of Interatomic Models"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the models from openkim.org."
LICENSE = "Apache-2.0 & CDDL-1.0 & MPL-2.0 & GPL-3.0-only & LGPL-3.0-only"

PV = "2021.08.11"

RPM_NAME = "openkim-models-2021.08.11-1.7.aarch64.rpm"
RPM_HASH = "abfe582c3659058b856771e63323c2c1471924223ffea27a664664e0c41412ea4f0f24bbee426c569c5965acb0ec1e85c35f848ee7c7119b08d86736d91a7b25"

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
