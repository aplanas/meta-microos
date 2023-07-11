SUMMARY = "Container Runtime for non-clustered systems"
DESCRIPTION = "This pattern installs the default container runtime packages for non-clustered systems."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "patterns-containers-container_runtime-5.1-6.1.aarch64.rpm"
RPM_HASH = "2655d64d5d17d73d505225823c36588869d1d90810ee5b8c16956e1b4394d8fc66cf0a3b2dd04ccbd94bdab5411148fb3bb0b1ce85d065a1d2f1264289b5f7a0"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-caasp-container-runtime \
patterns-containers-container-runtime"

RDEPENDS:${PN} += "containers-systemd \
pattern- \
podman"

inherit rpm
