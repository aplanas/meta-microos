SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-betamax-matchers-0.4.0-1.17.noarch.rpm"
RPM_HASH = "6da78b5375085e9f54c8b62e7ae8f21e8ed916b328bcff642c8aa69f5f2db3fce29e248fe769790f420554d8315fc3665b7e4de3cde5f0ff52f20f88d1396b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-betamax-matchers \
python310-betamax-matchers \
python3dist-betamax-matchers"

RDEPENDS:${PN} += "python-abi \
python310-betamax \
python310-requests-toolbelt"

inherit rpm
