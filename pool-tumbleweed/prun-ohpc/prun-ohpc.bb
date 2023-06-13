SUMMARY = "Convenience utility for parallel job launch"
DESCRIPTION = "prun provides a unified, script-based wrapper for launching parallel jobs \
within a resource manager for a variety of MPI families."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "prun-ohpc-1.2-1.10.noarch.rpm"
RPM_HASH = "2cf4722e11de8e4c3936b8a795bc4ff916cf1c44edc1665b1aa8d15f66ca73059f6fd28aa262bee93de0a5690c7fb7de3eeeb1829c76a20db509f204419322d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(prun-ohpc) \
prun-ohpc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
