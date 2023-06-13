SUMMARY = "Bash Completion for fnotifystat"
DESCRIPTION = "Bash completion script for fnotifystat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "fnotifystat-bash-completion-0.02.06-1.12.noarch.rpm"
RPM_HASH = "e9de345a1c5809a55be077e811d3fbad8d90218a56efbafb54847810cce01dae55b445554bfa3aa8bc3781125680981bf73bbf9463412954af3912d2de3c9285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnotifystat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fnotifystat"

inherit rpm
