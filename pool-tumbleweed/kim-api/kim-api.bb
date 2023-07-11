SUMMARY = "Open Knowledgebase of Interatomic Models KIM API"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package can be used to load all the files (libraries, headers, and \
documentation) for the KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-2.3.0-1.9.aarch64.rpm"
RPM_HASH = "7f12f3e4c493eca7c469ff45885c7bb92af92e6adf8734826f7f3340aedc20f47a301282a7d1fe9bc27d15ddc1d2a9d7b980a9fcf8258d223a9d9e1f6fa96396"

RPROVIDES:${PN} += "kim-api"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkim-api.so.2 \
libkim-api2 \
libstdc++.so.6"

inherit rpm
