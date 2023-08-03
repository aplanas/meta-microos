SUMMARY = "Bash Completion for mpv"
DESCRIPTION = "Bash command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "mpv-bash-completion-0.36.0+git.20230723.60a26324-1.1.noarch.rpm"
RPM_HASH = "ab8aee0df370b3c92711f51fd9fd53a3ef605cecb80201a4c33401801929a75f32108cf0571566651c500a76170f19829b75eb84d803b0ae0eecd1d45779b813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mpv"

inherit rpm
