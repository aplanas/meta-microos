SUMMARY = "Firejail zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for firejail"
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firejail-zsh-completion-0.9.72-1.1.aarch64.rpm"
RPM_HASH = "13c671468fd6fec7a0216d22e9598cd521923e3e590770738bcca74454ff75299b0ab3434855fd333afeb95bb7a976151e3ce71fa5d2861ffd6d5a84226d85d0"

RPROVIDES:${PN} += "firejail-zsh-completion \
firejail-zsh-completion(aarch-64)"
RDEPENDS:${PN} += "firejail \
zsh"

inherit rpm
