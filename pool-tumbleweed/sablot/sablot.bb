SUMMARY = "XSL Processor"
DESCRIPTION = "Sablotron is an XSL processor fully implemented in C++. The excellent \
Expat parser is used as the associated XML parser."
LICENSE = "GPL-2.0+"

PV = "1.0.3"

RPM_NAME = "sablot-1.0.3-130.29.aarch64.rpm"
RPM_HASH = "265224883710bff2bce22a7445405c7c43b9dbb425b01485af4c687eacdf917a9fb373cd104ebfe650b89b6a508454d761fa7371bb72043e21078aceb0e7f776"

RPROVIDES:${PN} += "libsablot.so.0 \
sablot \
sablotron"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
