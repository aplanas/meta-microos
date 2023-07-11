SUMMARY = "Bash completion for whois"
DESCRIPTION = "bash command line completion support for whois."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.17"

RPM_NAME = "whois-bash-completion-5.5.17-1.2.aarch64.rpm"
RPM_HASH = "8a5c2e1514f5c2f1b387c60214a4f24fe8f027624cbbd830f01ee30f95bc9931231a5490cd95be107cd14633afd1bde38c211217d72c8c659e68bd018d11ab4b"

RPROVIDES:${PN} += "whois-bash-completion"

RDEPENDS:${PN} += "bash-completion \
whois"

inherit rpm
