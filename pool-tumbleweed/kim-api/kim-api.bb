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

RPM_NAME = "kim-api-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "4fc2f5dd0c3fdbe931207522968de2a5171429faef8d2f06cb896c22b0276ad1a1300459a7995162cb5717253cea77868368be4c3e80f94ac418e58376edc6c2"

RPROVIDES:${PN} += "kim-api"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkim-api.so.2 \
libkim-api2 \
libstdc++.so.6"

inherit rpm
