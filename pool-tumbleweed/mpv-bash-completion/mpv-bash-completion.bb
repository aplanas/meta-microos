SUMMARY = "Bash Completion for mpv"
DESCRIPTION = "Bash command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git20230826.83c0e980"

RPM_NAME = "mpv-bash-completion-0.36.0+git20230826.83c0e980-1.1.noarch.rpm"
RPM_HASH = "486c5d0f2833967808fdc663b6d9412cc900f2f24bc46098bd8b567246000ada8ede3687e1a093c35db2dcdb47ed95d551c8da98889c799f20129c8e57be1a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mpv"

inherit rpm
