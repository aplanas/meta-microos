SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.6.1"

RPM_NAME = "podman-remote-4.6.1-2.1.aarch64.rpm"
RPM_HASH = "c6a62d9b5acd88b45b049af2b1157a6c235ef054a966317583f8795b9647ae1dc20066ec75597f24ec68f06af662473a5a01e9b2ca81b341491b905089177795"

RPROVIDES:${PN} += "podman-/usr/bin/podman-remote \
podman-remote"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
