SUMMARY = "Zsh Completion for firewalld"
DESCRIPTION = "Zsh command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-zsh-completion-2.0.0-2.1.noarch.rpm"
RPM_HASH = "1563c0c3f4d193ecd8da770980a0bb99cd18abb9d134ac7a1dcad6d848f0167787e12ad136559b775f6e3824c994e5b8294bbde4bf99c21d6a78d37d9ca5d2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-zsh-completion"

RDEPENDS:${PN} += "firewalld \
zsh"

inherit rpm
