SUMMARY = "Bash Completion for melange"
DESCRIPTION = "Bash command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-bash-completion-0.3.2-1.2.noarch.rpm"
RPM_HASH = "59058e98633915082f367793913e2389df5b2522b87e30ed3776cac30252586b49a412bdf5c9b16fe54a50fdbd56ce911621eb601b55ece6439a44bf46ee7458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-bash-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
