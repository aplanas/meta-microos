SUMMARY = "Set keywordprg in git rebase --interactive"
DESCRIPTION = "Set keywordprg in git rebase --interactive. This used to done before vim \
8.2.4529, but was changed afterwards. For details, see \
https://github.com/vim/vim/issues/9845."
LICENSE = "GPL-2.0-only"

PV = "1"

RPM_NAME = "vim-plugin-gitrebase-keywordprg-1-56.1.noarch.rpm"
RPM_HASH = "5887c784b78905ab6de7f6b2afed9750d56c7d8323957d9bacb0f925e4af1eef5be7fd2917f970c31c4dcbeafa24a15cda753ed0489ede71a7e9d6cc118816b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gitrebase-keywordprg"

RDEPENDS:${PN} += "git-core"

inherit rpm
