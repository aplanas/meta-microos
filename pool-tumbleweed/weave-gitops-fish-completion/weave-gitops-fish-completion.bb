SUMMARY = "Fish Completion for weave-gitops"
DESCRIPTION = "Fish command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.31.2"

RPM_NAME = "weave-gitops-fish-completion-0.31.2-1.1.noarch.rpm"
RPM_HASH = "6e28eef0d4fdf12309ac9d579071ba1c4c5fddfcc44fee7d4048b48fbac59993cb32864896e5c1b817bd1d1b29570f7b5424c6c691cbc232673d3edaad912ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-fish-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
