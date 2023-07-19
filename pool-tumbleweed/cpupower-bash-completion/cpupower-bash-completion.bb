SUMMARY = "Bash completion for cpupower"
DESCRIPTION = "bash command line completion support for cpupower."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "cpupower-bash-completion-6.4.3-4.17.noarch.rpm"
RPM_HASH = "02a874d7accc7089c4f7beb6baa505480ff69d6db76ff05777de81061594085265ca5666a87252024067ce857601dc5a82a8b183ae1a44aa6fbc59e0288bcdc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpupower"

inherit rpm
