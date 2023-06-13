SUMMARY = "Fish Completion for kustomize"
DESCRIPTION = "Fish command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-fish-completion-4.5.7-1.3.noarch.rpm"
RPM_HASH = "424257bb99d7b3b711b3241296ff3f66b3133ffc1e8bd9acbc2a3bae9ad715a3e5e13f0202af2dee153dac0eca164a9cf279b7c5ceda4cbae83a7e1b93072fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-fish-completion"

RDEPENDS:${PN} += "kustomize"

inherit rpm
