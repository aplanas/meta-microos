SUMMARY = "Container registry command line client"
DESCRIPTION = "Container registry v2 command line client and repo listing generator \
with security checks. It can be used to get and manipulate several \
informations about container images, manifestes and layers from a \
container registry including vulnerability reports and can generate a \
static website for a registry."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "reg-0.16.1-1.16.aarch64.rpm"
RPM_HASH = "07f83b8be1dac88d531e519077e613d7bf7eb01e757a6789a697778bbb4ca431169aa7471823bc3e67d1c3cd5088de7fa7dcce0dc71ddb44cd6a802cd7135f1d"

RPROVIDES:${PN} += "reg"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
