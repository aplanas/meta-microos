SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "perf-bash-completion-6.4.2-80.9.aarch64.rpm"
RPM_HASH = "dd2670f78404b72683e54afc725c7b6b3f1465d78fce5543d5b577d93a76c8b58577a1eb6fadd8f7a38f10e9266157d68cff5424f6e2433734875b7dcf52c823"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
