SUMMARY = "Fish Completion for kubeaudit"
DESCRIPTION = "Fish command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-fish-completion-0.22.0-1.2.noarch.rpm"
RPM_HASH = "616cf75f3a5c77e7de972757a6d2cffad17152fb4aae7f9bb38adf781db8756ea54a6261514dba3e808669ebfa587e18e12c1704991823c36884faec5c3f6612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-fish-completion"

RDEPENDS:${PN} += "kubeaudit"

inherit rpm
