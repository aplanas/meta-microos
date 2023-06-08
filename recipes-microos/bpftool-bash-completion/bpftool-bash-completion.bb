SUMMARY = "Bash completion for bpftool"
DESCRIPTION = "bash command line completion support for bpftool."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "bpftool-bash-completion-6.3.1-8.11.aarch64.rpm"
RPM_HASH = "7471f894622bd972048fbb36963be3acec1d040b7dbfacf37a01cf737714c971277732ae676e309e4d96665257f021fcfd2ff3f7b647f58c08a7361f9c05bd5e"

RPROVIDES:${PN} += "bpftool-bash-completion bpftool-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion bpftool"

inherit rpm
