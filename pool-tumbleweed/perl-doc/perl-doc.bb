SUMMARY = "Perl Documentation"
DESCRIPTION = "Perl man pages and pod files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.38.0"

RPM_NAME = "perl-doc-5.38.0-1.1.noarch.rpm"
RPM_HASH = "1c782ded9810cfe5a46c1b480c1c66fb3001e5f9548fb463405c0e0d677b8c4a7cc7081464224fb35535bb1b926d12e523d093b5fa038723f16d288acbf6ee20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-/usr/share/man/man3/CORE.3pm.gz \
perl-doc \
perl-macros"

RDEPENDS:${PN} += "perl"

inherit rpm
