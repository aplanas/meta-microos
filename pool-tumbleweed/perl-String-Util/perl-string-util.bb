SUMMARY = "String processing utility functions"
DESCRIPTION = "*String::Util* provides a collection of small, handy functions for \
processing strings in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.34"

RPM_NAME = "perl-String-Util-1.34-1.3.noarch.rpm"
RPM_HASH = "1a373f69f7f68d926449bdf96d9a1a3942ea17690ec52745fab2baa5cdeac719eb7fc545d004046ced7871f80221e48daffbdc46c6c179d225a151d8051424c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Util \
perl-String-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
