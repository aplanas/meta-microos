SUMMARY = "Bash completion for ZynAddSubFX"
DESCRIPTION = "Bash command line completion support for ZynAddSubFX."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-bash-completion-3.0.6-3.1.aarch64.rpm"
RPM_HASH = "86aee90d135ac9c50149c21d01c3d47e08684e1349dad42e9094b93bff2f6f4b7c261582e632964dcd73cd8718c09888d00e3157a2313f955c9df266ab79a735"

RPROVIDES:${PN} += "zynaddsubfx-bash-completion \
zynaddsubfx-bash-completion(aarch-64)"

RDEPENDS:${PN} += "bash \
zynaddsubfx"

inherit rpm
