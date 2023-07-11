SUMMARY = "String processing utility functions"
DESCRIPTION = "*String::Util* provides a collection of small, handy functions for \
processing strings in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.34"

RPM_NAME = "perl-String-Util-1.34-1.2.noarch.rpm"
RPM_HASH = "18d4d7c858a0684e4dbd05c7f81b835f6ccb7a8538a49ea5641b27d45df8efe9af5b04e07e91f375f8142d46ce1b576946632a9e97f889f0926f77f9cda9e665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Util \
perl-String-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
