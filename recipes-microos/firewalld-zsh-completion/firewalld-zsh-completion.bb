SUMMARY = "Zsh Completion for firewalld"
DESCRIPTION = "Zsh command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-zsh-completion-1.3.2-1.1.noarch.rpm"
RPM_HASH = "fecbed614c052715d4f678b088ebb75bdad8bab9d5d2a23e42e3d3213aa4ecab585d742a177c591c824322417a668681eae128ae1a6b19eac97820bc1e8d005f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-zsh-completion"
RDEPENDS:${PN} += "firewalld zsh"

inherit rpm
