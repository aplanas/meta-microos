SUMMARY = "Tool for spawning and running OCI containers"
DESCRIPTION = "runc is a CLI tool for spawning and running containers according to the OCI \
specification. It is designed to be as minimal as possible, and is the workhorse \
of Docker. It was originally designed to be a replacement for LXC within Docker, \
and has grown to become a separate project entirely."
LICENSE = "Apache-2.0"

PV = "1.1.8"

RPM_NAME = "runc-1.1.8-1.1.aarch64.rpm"
RPM_HASH = "1dd12f469d5ecfa5d4b252246e544447cfc9f3dd35ace6331ef0433b2f618760afb50bcce1f8d423b3468450fcfb7994121610c876baed4540ae546960141d00"

RPROVIDES:${PN} += "docker-runc \
docker-runc-kubic \
runc"

RDEPENDS:${PN} += "libc.so.6 \
libseccomp.so.2"

inherit rpm
