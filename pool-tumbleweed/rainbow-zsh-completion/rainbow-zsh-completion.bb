SUMMARY = "ZSH completion for rainbow"
DESCRIPTION = "Zsh command line completion support for rainbow."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-zsh-completion-2.8.0-1.5.noarch.rpm"
RPM_HASH = "6c09c4480c8d80b068a3842dbe137314afa801768b4c3d8bf77549a4c0a7eb28c386ab264d575255b739334bca35e7211364906839284ffd9cfe468b9b2f4093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rainbow-zsh-completion \
rainbow-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
