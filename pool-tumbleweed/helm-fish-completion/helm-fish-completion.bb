SUMMARY = "Fish Completion for helm"
DESCRIPTION = "Fish command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.3"

RPM_NAME = "helm-fish-completion-3.12.3-1.1.noarch.rpm"
RPM_HASH = "83ed51b9b35b376ab3054b8b1f0fcec45eda58961850482a95705c7c11670031af71077bc74cc1d4f9eacb31834c926c4528050005692fc575ac7078600dbe6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-fish-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
