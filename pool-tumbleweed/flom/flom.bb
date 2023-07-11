SUMMARY = "Distributed Lock Manager"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. When used \
in a shell environment, FLoM manages process synchronization in the same way \
that 'nice' manages process prioritization. It supports networking, abstract \
resources, offers a library, encryption and peer authentication."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "flom-1.6.1-1.2.aarch64.rpm"
RPM_HASH = "b3a431870470d192bcbce5d6a2f9679044f83a9983d5bdc2416660f9f5bb653eb6a250e184afc80a26c70df2583b3c4921599251a1930c4724f9523ce92aac04"

RPROVIDES:${PN} += "flom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libflom.so.0 \
libglib-2.0.so.0"

inherit rpm
