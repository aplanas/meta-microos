SUMMARY = "Bash Completion for dumpzilla"
DESCRIPTION = "Bash completion script for dumpzilla."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.0+git.20210311"

RPM_NAME = "dumpzilla-bash-completion-0.0.0+git.20210311-1.2.noarch.rpm"
RPM_HASH = "1716fab32380de6a44e540b3a060d663f3037a2d1f5954187e0fd3ec8d9d9f2d8776bab2a34f32877bda077a9d7eb54ec8be72255e23a68c5c06bc064ce4c9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dumpzilla-bash-completion"

RDEPENDS:${PN} += "bash-completion \
dumpzilla"

inherit rpm
