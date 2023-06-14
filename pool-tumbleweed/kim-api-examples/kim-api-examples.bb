SUMMARY = "Example models for kim-api"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the example models for the KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-examples-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "f016dacf491bf91691fd5babfb84099b472f8f114dda82ba958559be024a28470659b1132e778d4b78685ac201bf19bb765c5a30180e0cef5f8ce2d42a07d0f8"

RPROVIDES:${PN} += "kim-api-examples \
libkim-api-model-driver.so \
libkim-api-portable-model.so \
libkim-api-simulator-model.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libkim-api.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
