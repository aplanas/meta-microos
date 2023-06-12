SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-betamax-matchers-0.4.0-1.15.noarch.rpm"
RPM_HASH = "4d4b1f20541035ee41f3f2d4da8d0f5f185dec1c7de7c20bd90169ab70c9da277a344d94baf09b1e57c0a96805516361649b876a5249e5c27d10b68dbc656338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(betamax-matchers) \
python39-betamax-matchers \
python3dist(betamax-matchers)"
RDEPENDS:${PN} += "python(abi) \
python39-betamax \
python39-requests-toolbelt"

inherit rpm
