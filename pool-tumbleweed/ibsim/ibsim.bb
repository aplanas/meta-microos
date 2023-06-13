SUMMARY = "InfiniBand fabric simulator for management"
DESCRIPTION = "ibsim provides simulation of infiniband fabric for using with OFA \
OpenSM, diagnostic and management tools."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.11"

RPM_NAME = "ibsim-0.11-1.8.aarch64.rpm"
RPM_HASH = "084953c23757b95a7a06d434d1c96606c68e09e40733868bf4e8775f842f82003d04caa9a3ef4af1e651a136344996c887640d47a0e29f61bcce64698b069208"

RPROVIDES:${PN} += "ibsim \
ibsim(aarch-64) \
libumad2sim.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibmad.so.5()(64bit) \
libibumad.so.3()(64bit)"

inherit rpm
