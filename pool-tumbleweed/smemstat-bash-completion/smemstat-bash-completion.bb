SUMMARY = "Bash Completion for smemstat"
DESCRIPTION = "Bash completion script for smemstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.12"

RPM_NAME = "smemstat-bash-completion-0.02.12-1.1.noarch.rpm"
RPM_HASH = "a36abf9f60ddaa7e204f96876ad114fa3410053e4c0fdb3be7214142e02f8795cd6da95c5bf8a03f355af47a870a97a23f5e33ff7ddd6ee0a16ca81308a34620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smemstat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
smemstat"

inherit rpm
