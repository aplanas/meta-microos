SUMMARY = "Perl Documentation"
DESCRIPTION = "Perl man pages and pod files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.36.1"

RPM_NAME = "perl-doc-5.36.1-1.3.noarch.rpm"
RPM_HASH = "6830a591cf2503c92c3be226c988977e9510195842dcd829a2a8013e4bca8dd8247f1d7825e6e9271eab7308617b62e71081c13c9a55f71604187078cdada22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-/usr/share/man/man3/CORE.3pm.gz \
perl-doc \
perl-macros"

RDEPENDS:${PN} += "perl"

inherit rpm
