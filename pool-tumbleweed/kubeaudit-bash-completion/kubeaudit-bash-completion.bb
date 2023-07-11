SUMMARY = "Bash Completion for kubeaudit"
DESCRIPTION = "Bash command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-bash-completion-0.22.0-1.3.noarch.rpm"
RPM_HASH = "bfe4a299f039c25a14f9fc3fef37d0f935b64a4abef522aa3c32c77889e7613369ac14f26497820f1b8ce1f91dbfff8d7d3f3a4184b9729efb224798c4e0d7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubeaudit"

inherit rpm
