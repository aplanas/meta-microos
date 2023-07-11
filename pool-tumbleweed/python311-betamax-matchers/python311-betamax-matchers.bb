SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-betamax-matchers-0.4.0-1.17.noarch.rpm"
RPM_HASH = "521b244f0623d8beef4d440bc6e632eea01cb045457ab25ac11d70f5e0a12ca916d3224adfaaba349a210bdd69ec912e4e39b53e050086ba96b080367fdef9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betamax-matchers \
python3.11dist-betamax-matchers \
python311-betamax-matchers \
python3dist-betamax-matchers"

RDEPENDS:${PN} += "python-abi \
python311-betamax \
python311-requests-toolbelt"

inherit rpm
