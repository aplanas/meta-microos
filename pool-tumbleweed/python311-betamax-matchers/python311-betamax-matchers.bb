SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-betamax-matchers-0.4.0-1.15.noarch.rpm"
RPM_HASH = "50250254abeb3c81f144d49c665cc57d11a30e50596111ac222f5853dd5c798d5f38875d9c74f4c0de50183cc7b75ce908769bf81d67c29a64114716ce521fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(betamax-matchers) \
python311-betamax-matchers \
python3dist(betamax-matchers)"

RDEPENDS:${PN} += "python(abi) \
python311-betamax \
python311-requests-toolbelt"

inherit rpm
