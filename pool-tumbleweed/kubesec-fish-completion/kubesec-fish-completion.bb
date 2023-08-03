SUMMARY = "Fish Completion for kubesec"
DESCRIPTION = "Fish command line completion support for kubesec."
LICENSE = "Apache-2.0"

PV = "2.13.0"

RPM_NAME = "kubesec-fish-completion-2.13.0-1.1.noarch.rpm"
RPM_HASH = "872dd199c9b116ce4b6f9d6d040ac8312d39ecd1b784682834a5e30334f2cb73c014f0979891be4214f57bf6b34f5d6e46dd2d789dec552e721b700c00254b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubesec-fish-completion"

RDEPENDS:${PN} += "kubesec"

inherit rpm
