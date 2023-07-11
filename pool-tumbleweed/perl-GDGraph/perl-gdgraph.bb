SUMMARY = "Produces charts with GD"
DESCRIPTION = "Produces charts with GD"
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & GPL-2.0-or-later"

PV = "1.54"

RPM_NAME = "perl-GDGraph-1.54-3.8.noarch.rpm"
RPM_HASH = "d64985294cd83b11112aedeaf1599b92b917efd021d4343cf85a7bd5c18ebadc4113c9dd3148234a107398772d6115257ce2e65725a2926afba5c64f07a826d9"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-GD \
perl-GD--Text"

inherit rpm
