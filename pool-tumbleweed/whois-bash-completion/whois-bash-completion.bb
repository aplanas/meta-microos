SUMMARY = "Bash completion for whois"
DESCRIPTION = "bash command line completion support for whois."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.18"

RPM_NAME = "whois-bash-completion-5.5.18-1.1.aarch64.rpm"
RPM_HASH = "285838767ecb8aa2bee3f7cca011280625259842d995eedd6e2708bdaa7846a6249a4464068f8e6109c37bde71f6900fab471b7212ee6a6359fe91775c02fe30"

RPROVIDES:${PN} += "whois-bash-completion"

RDEPENDS:${PN} += "bash-completion \
whois"

inherit rpm
