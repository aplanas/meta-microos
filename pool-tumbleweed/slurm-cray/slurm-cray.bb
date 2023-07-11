SUMMARY = "Cray specific plugins"
DESCRIPTION = "Plugins for specific cray hardware, includes power and knl node management. \
Contains also cray specific documentation."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-cray-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "3b380489b52a23023973a85d5782bad641d785c1aa4bba6ac8f692337f8a149c2367761c12800659ed0f57026c1a5e5121d040dd9ac31190f4d3efcad23626dc"

RPROVIDES:${PN} += "slurm-cray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5"

inherit rpm
