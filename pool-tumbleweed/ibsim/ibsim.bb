SUMMARY = "InfiniBand fabric simulator for management"
DESCRIPTION = "ibsim provides simulation of infiniband fabric for using with OFA \
OpenSM, diagnostic and management tools."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.11"

RPM_NAME = "ibsim-0.11-1.9.aarch64.rpm"
RPM_HASH = "7fe7a48c1a5f0501103c2ca7f23c7a963254170ee63fc87213d79d65751877bf96c1a233bf6b448db15601cb32906f809dce355c1280e3f6417bf2f623d9ae2b"

RPROVIDES:${PN} += "ibsim \
libumad2sim.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
