SUMMARY = "Bash Completion for firewalld"
DESCRIPTION = "Bash command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-bash-completion-2.0.0-2.1.noarch.rpm"
RPM_HASH = "b4d166a5e74fce28356a262a5ee58536ee0564d11eed327aa908fecd93abe7bfb1262146e55b75726435505701e6c66c304d4dcd7f7cd60c0114a2fdb9df3417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-bash-completion"

RDEPENDS:${PN} += "bash-completion \
firewalld"

inherit rpm
