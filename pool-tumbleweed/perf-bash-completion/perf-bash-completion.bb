SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "perf-bash-completion-6.4.3-80.10.aarch64.rpm"
RPM_HASH = "5828bcdf91d1f485663f22510d2310f22f59d03f084de4e505700be338d3744a23ddc3e842a0ce92027b3b7519c449824e9c009b5663dbb17c1b145f496beee0"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
