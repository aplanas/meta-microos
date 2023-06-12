SUMMARY = "Container Runtime for non-clustered systems"
DESCRIPTION = "This pattern installs the default container runtime packages for non-clustered systems."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-containers-container_runtime-5.1-5.2.aarch64.rpm"
RPM_HASH = "1ad5cd56043ab4eee45acc908d69c4970773863ba8763112bae0c7cfc07a0b401b6071dc252c4a54546d74f87b33f32b681338b9e809a26fc11dc7080e8395c4"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-caasp-container-runtime \
patterns-containers-container_runtime \
patterns-containers-container_runtime(aarch-64)"
RDEPENDS:${PN} += "(distrobox if patterns-microos-desktop-common else toolbox) \
containers-systemd \
pattern() \
podman \
podman-cni-config"

inherit rpm
