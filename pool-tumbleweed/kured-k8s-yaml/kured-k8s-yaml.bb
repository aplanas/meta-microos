SUMMARY = "Kubernetes yaml file to run kured container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
kured container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "kured-k8s-yaml-1.10.2-1.4.noarch.rpm"
RPM_HASH = "930739e79d05375e7479540e1d29ea12ce4ce1a0112ac9d6560df56ed4adb6358b911e592d5684050baa04776a54e6b791c2e8cf0105124a3b2e8d33b1ebd0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kured-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
