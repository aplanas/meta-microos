SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.6.0"

RPM_NAME = "podman-remote-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "c26b42f0120975f09011e5b1762abe61f4cbcef52e89211d353d2ecdb76a12f7298f954308bc2eda5829e5cacc2dd05f67278c6826cb7eb7294c885551b6713a"

RPROVIDES:${PN} += "podman-/usr/bin/podman-remote \
podman-remote"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
