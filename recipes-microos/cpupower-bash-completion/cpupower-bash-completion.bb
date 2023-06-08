SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "cpupower-bash-completion-6.3.1-4.10.noarch.rpm"
RPM_HASH = "fbe69a3d423c3b1f75477708c60cc4908a5b09055857eab2ae6941b851167f891a4b7a7f794ee1ba27b5084849850e353b3a68be69f39786de32ab875f6f1562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"
RDEPENDS:${PN} += "bash-completion cpupower"

inherit rpm
