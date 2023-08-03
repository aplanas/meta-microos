SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "perf-bash-completion-6.4.6-80.12.aarch64.rpm"
RPM_HASH = "e5f4ad0267300e1008437b7916181a8a3da24f006aac9397301c07999d021c375ba2e49bb81a645a4dec7874d9329a599236fa8afc33d365263036131b7a0a4c"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
