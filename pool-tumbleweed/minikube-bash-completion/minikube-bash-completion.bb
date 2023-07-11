SUMMARY = "Minikube bash completion"
DESCRIPTION = "Optional bash completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "minikube-bash-completion-1.30.1-1.3.noarch.rpm"
RPM_HASH = "46402e06da4ada3f9816c53f914f46d8336faa78bbf87c5ccd88cd780ff7e6df0936b13b3c881e98e13cd8dac38d77031adad9b092292e33bfb74e1f858224c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
minikube"

inherit rpm
