SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-remote-4.5.1-2.1.aarch64.rpm"
RPM_HASH = "099bcce6301d9d3ec44d155b10eba04cfc8562e06687e8ef575f1b84336234f58fab2ecee309f90f0bfb72d665f42f4ec29c1dad6b966cebf3413e3239f4c6c6"

RPROVIDES:${PN} += "podman-/usr/bin/podman-remote \
podman-remote"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
