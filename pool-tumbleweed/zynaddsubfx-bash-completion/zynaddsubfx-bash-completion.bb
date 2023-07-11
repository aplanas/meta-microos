SUMMARY = "Bash completion for ZynAddSubFX"
DESCRIPTION = "Bash command line completion support for ZynAddSubFX."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-bash-completion-3.0.6-3.2.aarch64.rpm"
RPM_HASH = "875a5497080c92a88f3f2e976f133737538f21976a4476948c3874a57382fdd8b7bea7523b0bbc213a5386b5ee74dea5bcf6a8d94bc2de8246df0e99f25b06b2"

RPROVIDES:${PN} += "zynaddsubfx-bash-completion"

RDEPENDS:${PN} += "bash \
zynaddsubfx"

inherit rpm
