SUMMARY = "Example models for kim-api"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the example models for the KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-examples-2.3.0-1.9.aarch64.rpm"
RPM_HASH = "1e1c6574010ce3097d33b05edabd6fc93a739f06fb45be57a420d283dacd17df6766700291598ec5c07be1d992a6970e3c69fc31ceb4c6ed90d52ecb582ca13e"

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
