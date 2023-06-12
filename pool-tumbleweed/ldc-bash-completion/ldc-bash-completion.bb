SUMMARY = "LDC Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for ldc2"
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "ldc-bash-completion-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "ab790993a2c68552b3b5826ab863c000e9d5cf247bdd4cfd9bc3a3d41016e0e45e24246a3fa949680a5b3a57b0cba33bd77386d19b0f350d73b13ae700782d1b"

RPROVIDES:${PN} += "ldc-bash-completion \
ldc-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion \
ldc"

inherit rpm
