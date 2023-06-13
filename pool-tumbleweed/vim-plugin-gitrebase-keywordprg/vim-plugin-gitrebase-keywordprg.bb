SUMMARY = "Set keywordprg in git rebase --interactive"
DESCRIPTION = "Set keywordprg in git rebase --interactive. This used to done before vim \
8.2.4529, but was changed afterwards. For details, see \
https://github.com/vim/vim/issues/9845."
LICENSE = "GPL-2.0-only"

PV = "1"

RPM_NAME = "vim-plugin-gitrebase-keywordprg-1-55.1.noarch.rpm"
RPM_HASH = "b684195a22f03bb5e68c6dc8a9211585156c9758d0aa8d35a0f7ff5fa3fa0da7e64d48aba88652eb7a179d2dbb99fde19548d4d96d98c84f05219034bea6321d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gitrebase-keywordprg"

RDEPENDS:${PN} += "git-core"

inherit rpm
