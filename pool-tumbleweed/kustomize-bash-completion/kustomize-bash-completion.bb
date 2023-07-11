SUMMARY = "Bash Completion for kustomize"
DESCRIPTION = "Bash command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-bash-completion-4.5.7-1.4.noarch.rpm"
RPM_HASH = "0450f956d34f578beb79703386b33f987ca0d86159b435315343e6f0c3947f2d3d6db2555754b7748c1641ecf08fc49b0d025a28d7c349597e52ea22f64fdf0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-bash-completion"

RDEPENDS:${PN} += "kustomize"

inherit rpm
