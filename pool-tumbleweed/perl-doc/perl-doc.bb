SUMMARY = "Perl Documentation"
DESCRIPTION = "Perl man pages and pod files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.36.0"

RPM_NAME = "perl-doc-5.36.0-4.3.noarch.rpm"
RPM_HASH = "238f554ab8cc4dcb2fd9b05d15b43e52fee225274e629d52b006049d7538c6c33af9b41400132d624e5f1dc676620c9c677412e8912ddc0352b3ce04fb85d43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-doc \
perl-macros \
perl:/usr/share/man/man3/CORE.3pm.gz"
RDEPENDS:${PN} += "perl"

inherit rpm
