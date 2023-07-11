SUMMARY = "Bash Completion for cpustat"
DESCRIPTION = "Bash completion script for cpustat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.15"

RPM_NAME = "cpustat-bash-completion-0.02.15-1.9.noarch.rpm"
RPM_HASH = "8289ee3b3ba024afad9672042ce00242b38570ba014ac19926c450460fe1bc130a061950430123f4ec782b51491e50809eb7f8ac463c9f70375d064f8c12cdf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpustat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpustat"

inherit rpm
