SUMMARY = "Fish Completion for kubeaudit"
DESCRIPTION = "Fish command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-fish-completion-0.22.0-1.3.noarch.rpm"
RPM_HASH = "d0c63cde9f06585e430ce3960145f1de5c2dceebb83b4780c67a3a05985f48da51fe0d4ee0de0aec6002a8f70c2c67281ed79b005a7ab6bdd1b18a304eda0372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-fish-completion"

RDEPENDS:${PN} += "kubeaudit"

inherit rpm
