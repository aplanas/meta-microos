SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.117.0"

RPM_NAME = "hugo-bash-completion-0.117.0-1.1.noarch.rpm"
RPM_HASH = "996059e079161a301f59e93e6445023566dace13ac8e5383f0932767fa4c68a058e4203edeb84903646aad090201304e4daf6bfed9f4f75bc95ebb8a447de969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
