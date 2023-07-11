SUMMARY = "Fish Completion for weave-gitops"
DESCRIPTION = "Fish command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.27.0"

RPM_NAME = "weave-gitops-fish-completion-0.27.0-1.1.noarch.rpm"
RPM_HASH = "e0f8abd4a0f59c369a79d1973bea39966bfb9c725fb813d5bdec7eb6fff259b001b7dcd7170af0e28ca16de3c68772a9cf47801fd6cacf2045e9e701058c4937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-fish-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
