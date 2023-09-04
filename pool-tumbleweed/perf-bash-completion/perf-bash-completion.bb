SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "perf-bash-completion-6.4.11-81.1.aarch64.rpm"
RPM_HASH = "6aa60b96784163b7d92c46bc103746d3519adfcc8c375dac974f8f1510b3ac37909f406f1ad06862f21f989fc80bf53209a5795b8304549dc71a4858e8eab4ac"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
