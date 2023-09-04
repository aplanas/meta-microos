SUMMARY = "3d extension for perl-GDGraph"
DESCRIPTION = "This is the GD::Graph3d extensions module. It provides 3D graphs for \
the GD::Graph module by Martien Verbruggen, which in turn generates \
graph using Lincoln Stein's GD.pm."
LICENSE = "Artistic-1.0"

PV = "0.63"

RPM_NAME = "perl-GD-Graph3d-0.63-271.22.aarch64.rpm"
RPM_HASH = "3086ecf16b233117844011b41d2a22c74176f315562382c9331897b720a21813fa5841bdfaab5c0cdddb59fd682e2ee6fade4a33a1b8ab4661c7f0ee125f5161"

RPROVIDES:${PN} += "perl-GD--Graph--axestype3d \
perl-GD--Graph--bars3d \
perl-GD--Graph--cylinder \
perl-GD--Graph--cylinder3d \
perl-GD--Graph--lines3d \
perl-GD--Graph--pie3d \
perl-GD--Graph3d \
perl-GD-Graph3d \
perl-GDGraph3d"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
