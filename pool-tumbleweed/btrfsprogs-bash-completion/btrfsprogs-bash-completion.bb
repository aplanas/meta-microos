SUMMARY = "Bash completion for btrfsprogs"
DESCRIPTION = "bash command line completion support for btrfsprogs."
LICENSE = "GPL-2.0-only"

PV = "6.5"

RPM_NAME = "btrfsprogs-bash-completion-6.5-1.1.aarch64.rpm"
RPM_HASH = "fb248047b7e1a3e6489a58d0d36dd78ccbadeb131fea278599d132ab956a0e4918e897896b8f0bf632c1340ddbb83b0cd595b8fdb7bd863e72c5d06fd39986e3"

RPROVIDES:${PN} += "btrfsprogs-bash-completion"

RDEPENDS:${PN} += "bash-completion \
btrfsprogs"

inherit rpm
