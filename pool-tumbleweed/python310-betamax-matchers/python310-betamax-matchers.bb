SUMMARY = "A group of experimental matchers for Betamax"
DESCRIPTION = "Experimental set of Matchers for Betamax that may possibly end up in the \
main package."
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python310-betamax-matchers-0.4.0-1.15.noarch.rpm"
RPM_HASH = "7f48a9d13eee28093f116c2d491b667dc752a7d6f049a9f075d14cdcf3b17145fbfd2256dbfc7b97710911fc6d765fd0b48100c43b04e90e69b779fb1045502a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-betamax-matchers \
python3.10dist(betamax-matchers) \
python310-betamax-matchers \
python3dist(betamax-matchers)"

RDEPENDS:${PN} += "python(abi) \
python310-betamax \
python310-requests-toolbelt"

inherit rpm
