SUMMARY = "Bash completion for Clevis"
DESCRIPTION = "This package provides Bash completion for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-bash-completion-19-2.1.aarch64.rpm"
RPM_HASH = "b693cfca09c782fee880b6667bf626894bfb3915bb8e4ad63731441e0e1712ecf733ce446af86ad5eb0031914c0daa05df7d242512aa41fe2f288defd9328a0a"

RPROVIDES:${PN} += "clevis-bash-completion"

RDEPENDS:${PN} += "bash-completion \
clevis"

inherit rpm
