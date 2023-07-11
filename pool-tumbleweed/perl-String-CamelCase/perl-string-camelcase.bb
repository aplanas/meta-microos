SUMMARY = "Camelcase, de-Camelcase"
DESCRIPTION = "camelcase, de-camelcase"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-String-CamelCase-0.04-1.19.noarch.rpm"
RPM_HASH = "c9ae35e96dac48570058eb482554c0fb37af18c06d6666699f0877690ee698ee913836b290bca7a4815aeeecb6215b36cf79d131b68e378d66ec8f6f02442792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--CamelCase \
perl-String-CamelCase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
