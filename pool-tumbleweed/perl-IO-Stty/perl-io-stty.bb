SUMMARY = "Change and print terminal line settings"
DESCRIPTION = "This is the PERL POSIX compliant stty."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-IO-Stty-0.04-1.13.noarch.rpm"
RPM_HASH = "8e39135281867ee94d9c9ed4b092168327fe632de27f0a6d979ba80966bf16d44edb24b2590cbab17a35f9efcbf50d90b974a8b7bf7560800cf7a4d5e74eb0a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Stty \
perl-IO-Stty"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
