SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "perf-bash-completion-6.4.12-81.2.aarch64.rpm"
RPM_HASH = "a8e2f65510328a1617b5608454ec1959e92785ce63169f603cd6fd5241d9da540f0b709047f65bab40d999390597415b3fd328c1bbb1d60be00f06b2332f09dc"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
