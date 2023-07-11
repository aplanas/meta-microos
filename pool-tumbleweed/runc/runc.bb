SUMMARY = "Tool for spawning and running OCI containers"
DESCRIPTION = "runc is a CLI tool for spawning and running containers according to the OCI \
specification. It is designed to be as minimal as possible, and is the workhorse \
of Docker. It was originally designed to be a replacement for LXC within Docker, \
and has grown to become a separate project entirely."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "runc-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "af4f1d3d5f3757bcf0117229307b40b932cc6a3fa88b356e6ac4464eca9789c03b932fc8d875e23175dbcf43d4b7bdf1b9e5271bb718698e3d260809f576314e"

RPROVIDES:${PN} += "docker-runc \
docker-runc-kubic \
runc"

RDEPENDS:${PN} += "libc.so.6 \
libseccomp.so.2"

inherit rpm
