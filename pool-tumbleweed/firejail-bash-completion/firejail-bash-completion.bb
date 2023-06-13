SUMMARY = "Firejail Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for firejail"
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firejail-bash-completion-0.9.72-1.1.aarch64.rpm"
RPM_HASH = "5fa36f60ad1e1cfc3a8290df98843986ac403232de58af05b5694230cec7f14c409031e6b696bc62c5d57c8ce48de45b11491d60b4ea16bc788db37fd5248ba7"

RPROVIDES:${PN} += "firejail-bash-completion \
firejail-bash-completion(aarch-64)"

RDEPENDS:${PN} += "bash-completion \
firejail"

inherit rpm
