SUMMARY = "Bash completion for cpu-x"
DESCRIPTION = "Shell completion definitions from cpu-x for cpu-x."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-bash-completion-4.5.3-1.1.noarch.rpm"
RPM_HASH = "af1c3a06ed1738479f0338b2586eb8647725d77d966b716107fa45d0dc88b24835e5d63b670c19c4155756bfb0167cabdcb886cf41a926870291903d4151942d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpu-x-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
