SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "perf-bash-completion-6.3.4-80.3.aarch64.rpm"
RPM_HASH = "4ffac0ab913fc030d87fb919067139177fb426910d6e4344cfa30b49516e2533a67b1170a2fa081474f45fceec5085f1d87658ee16db0a1fd66b53548f6f3f84"

RPROVIDES:${PN} += "perf-bash-completion \
perf-bash-completion(aarch-64)"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
