SUMMARY = "Fish Completion for weave-gitops"
DESCRIPTION = "Fish command line completion support for weave-gitops."
LICENSE = "MPL-2.0"

PV = "0.29.0"

RPM_NAME = "weave-gitops-fish-completion-0.29.0-1.1.noarch.rpm"
RPM_HASH = "d51f7395283b83f658d590ac8b827db822861c576fd3ee541381403f4635cc901151e915c1632912ba3307b0150a20c66c9064dc00de5c0e34acf12b365b16c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-gitops-fish-completion"

RDEPENDS:${PN} += "weave-gitops"

inherit rpm
