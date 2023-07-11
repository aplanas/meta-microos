SUMMARY = "Fish Completion for nova"
DESCRIPTION = "Fish command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-fish-completion-3.6.5-1.2.noarch.rpm"
RPM_HASH = "23920ccff7f52331f3b377d17e3e5c5c8405915f6eb52e3b567b228bbac39a9623fd78ebe762b2e9bf3def5b54714c87925ccc467cbed5391177c599967bcb8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-fish-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
