SUMMARY = "Bash Completion for mpv"
DESCRIPTION = "Bash command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.35.1+git.20230315.e1727553"

RPM_NAME = "mpv-bash-completion-0.35.1+git.20230315.e1727553-1.5.noarch.rpm"
RPM_HASH = "33f226e2cbd697cd450e7d3d50623a2b14b816b5c617e4208d48a398ab5f8a9d000fc96f4d6cf7c99f018c4e9407c14bd8e93ec84756dee8ed2f34e446f83b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mpv"

inherit rpm
