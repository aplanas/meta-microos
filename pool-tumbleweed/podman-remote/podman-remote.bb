SUMMARY = "Client for managing podman containers remotely"
DESCRIPTION = "This client allows controlling podman on a separate host, e.g. over SSH."
LICENSE = "Apache-2.0"

PV = "4.5.1"

RPM_NAME = "podman-remote-4.5.1-1.2.aarch64.rpm"
RPM_HASH = "cd84e9e9df1c6ef9d9440f6abf4a025beac9854b51d6348ca5219bb836a86b779c1384ae4f8e748548335bbe0621a1b270fc8df144cf90b41dc99a88ea40127e"

RPROVIDES:${PN} += "podman-/usr/bin/podman-remote \
podman-remote"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
