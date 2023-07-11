SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "perf-bash-completion-6.3.9-80.8.aarch64.rpm"
RPM_HASH = "34fe189ec2793d0a28d6e8b9a4bb329ac1c4dac25e1251a44955f330f8eae2a96d07a24acc662c7b289f9dfa8074b5e2cfcf46cbb896e2a4cdfa3548dbc4ac8d"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
