SUMMARY = "Enable all of the features of Modern Perl with one import"
DESCRIPTION = "enable all of the features of Modern Perl with one import"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230106"

RPM_NAME = "perl-Modern-Perl-1.20230106-1.2.noarch.rpm"
RPM_HASH = "e1221027d5f43aa38ffbb4979e74904127095c8cdf1195c0d5dba979781097bca16e4be0a0190218535c4d8a48c341312ed4e6e0acae07cdd9f4bad19d5bc042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Modern--Perl \
perl-Modern-Perl \
perl-odern--Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-feature \
perl-mro"

inherit rpm
