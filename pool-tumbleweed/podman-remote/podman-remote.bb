SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.6.2"

RPM_NAME = "podman-remote-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "e03afa9b4f5725751c35aeb20f16ef606c4ea28474f6d7793c921a67de38e98f7dd8e3ede124d6cb82bfb68d4be50b30a0360c9a32595de7fcd5dc98ad0e319e"

RPROVIDES:${PN} += "podman-/usr/bin/podman-remote \
podman-remote"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
