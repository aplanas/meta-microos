SUMMARY = "Minikube bash completion"
DESCRIPTION = "Optional bash completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "minikube-bash-completion-1.30.1-1.2.noarch.rpm"
RPM_HASH = "43e1217f850118171e44f7c42ff1f61d59b0c02528e60274b2833a6509a1847d7cbe343d0acfd5db137fa954f05adf3ba589ae55ceb36933358301b4202a7b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
minikube"

inherit rpm
