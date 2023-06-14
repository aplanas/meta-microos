SUMMARY = "3d extension for perl-GDGraph"
DESCRIPTION = "This is the GD::Graph3d extensions module. It provides 3D graphs for \
the GD::Graph module by Martien Verbruggen, which in turn generates \
graph using Lincoln Stein's GD.pm."
LICENSE = "Artistic-1.0"

PV = "0.63"

RPM_NAME = "perl-GD-Graph3d-0.63-271.20.aarch64.rpm"
RPM_HASH = "f517deca4417536d799f88dd0d9c56db00c9b64232b8cb42f63a151e31e4803ba51f7a84bcf7becdcd04c0efe0e52af5f8a2d0502c2cdde56e89a8432e6f53da"

RPROVIDES:${PN} += "perl-GD--Graph--axestype3d \
perl-GD--Graph--bars3d \
perl-GD--Graph--cylinder \
perl-GD--Graph--cylinder3d \
perl-GD--Graph--lines3d \
perl-GD--Graph--pie3d \
perl-GD--Graph3d \
perl-GD-Graph3d \
perl-GDGraph3d"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
