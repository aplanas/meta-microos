SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python39-betamax-matchers-0.4.0-1.17.noarch.rpm"
RPM_HASH = "2b9a9fd3499d6bbe28fd337ccc98a81a8e33e1b37743a189cb756288f0395b3dbf517ffa14029b32210d954efe100b92a874386e71b7fdcf74fb484506ca06b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-betamax-matchers \
python39-betamax-matchers \
python3dist-betamax-matchers"

RDEPENDS:${PN} += "python-abi \
python39-betamax \
python39-requests-toolbelt"

inherit rpm
