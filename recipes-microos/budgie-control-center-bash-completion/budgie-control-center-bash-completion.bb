SUMMARY = "Bash Completion for Budgie Control Center"
DESCRIPTION = "This package contains the Bash Completion for Budgie Control Center"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0+0"

RPM_NAME = "budgie-control-center-bash-completion-1.2.0+0-1.3.aarch64.rpm"
RPM_HASH = "241dfa1ebfdec808c80fb8bcec9dd443c45a1ed1792809759b14f09032d41c71004a52e10ea3e040f0c4a74ce97a438bfdb52d0c2d5a6d200569290f6c447f17"

RPROVIDES:${PN} += "budgie-control-center-bash-completion budgie-control-center-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion budgie-control-center"

inherit rpm
