SUMMARY = "Produces charts with GD"
DESCRIPTION = "Produces charts with GD"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-or-later"

PV = "1.54"

RPM_NAME = "perl-GDGraph-1.54-3.9.noarch.rpm"
RPM_HASH = "76dbf8727ddd393c458c9be4868451c486cd52b6337be91c5f8940ac85e199b654d2d5d9fa94218f43a988d3c9881e6a0b39e1d226445c50d36510ef8ad02d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GD--Graph \
perl-GD--Graph--Data \
perl-GD--Graph--Error \
perl-GD--Graph--area \
perl-GD--Graph--axestype \
perl-GD--Graph--bars \
perl-GD--Graph--colour \
perl-GD--Graph--hbars \
perl-GD--Graph--lines \
perl-GD--Graph--linespoints \
perl-GD--Graph--mixed \
perl-GD--Graph--pie \
perl-GD--Graph--points \
perl-GD--Graph--utils \
perl-GDGraph"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-GD \
perl-GD--Text"

inherit rpm
