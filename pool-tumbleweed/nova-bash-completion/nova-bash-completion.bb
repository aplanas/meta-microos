SUMMARY = "Bash Completion for nova"
DESCRIPTION = "Bash command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "nova-bash-completion-3.7.0-1.1.noarch.rpm"
RPM_HASH = "3e39af41d6b940b8b1d26df07e785679c5b33b8adfa0cf9adc0de9369ec96956b1062880a99e4ebc7ec55243ada67c03c311fc09122117b6fc06e4fee1abe3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nova"

inherit rpm
