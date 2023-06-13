SUMMARY = "Tool for spawning and running OCI containers"
DESCRIPTION = "runc is a CLI tool for spawning and running containers according to the OCI \
specification. It is designed to be as minimal as possible, and is the workhorse \
of Docker. It was originally designed to be a replacement for LXC within Docker, \
and has grown to become a separate project entirely."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "runc-1.1.7-1.2.aarch64.rpm"
RPM_HASH = "60e9bddb19bf817a1899ed9a961cda46c60d39f89f0c76805b7086b8d925956e02f0e7e575c891518d8aafe5e18545d88148d6a7d909192a5cea980039a61ec1"

RPROVIDES:${PN} += "docker-runc \
docker-runc-kubic \
runc \
runc(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libseccomp.so.2()(64bit)"

inherit rpm
