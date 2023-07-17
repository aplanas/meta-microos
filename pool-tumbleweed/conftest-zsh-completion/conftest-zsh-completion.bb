SUMMARY = "Zsh Completion for conftest"
DESCRIPTION = "Zsh command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.44.1"

RPM_NAME = "conftest-zsh-completion-0.44.1-1.1.noarch.rpm"
RPM_HASH = "59d7ac2142d0912d00acec5955b9c53e0392321d7967e618db0632381bbe929bafd0abdcb5f3e94756efb575d48cda88f9e9da6be2c2ecc3482f24fdbcc7788a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-zsh-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
