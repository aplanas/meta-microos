SUMMARY = "Bash completion for whois"
DESCRIPTION = "bash command line completion support for whois."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.18"

RPM_NAME = "whois-bash-completion-5.5.18-1.2.aarch64.rpm"
RPM_HASH = "e8f9391e3e278ba3ea45afafdb2eb9bee5ef6a031b479fda26043a10b8a8729d2ac385c39cdb2a432b569d065f8560482ec80459ff2cb38da15067c843f46167"

RPROVIDES:${PN} += "whois-bash-completion"

RDEPENDS:${PN} += "bash-completion \
whois"

inherit rpm
