SUMMARY = "Minikube bash completion"
DESCRIPTION = "Optional bash completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "minikube-bash-completion-1.31.0-1.1.noarch.rpm"
RPM_HASH = "e8fbae8dfb6414a7af75ffc0c9c6a4545e832bde7fb57706f974dbfde2abf34de2eb475258636428f4c60371d0c33672d4d3e5b5cfc806ab56890bef36bb7373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
minikube"

inherit rpm
