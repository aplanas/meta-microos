SUMMARY = "3d extension for perl-GDGraph"
DESCRIPTION = "This is the GD::Graph3d extensions module. It provides 3D graphs for \
the GD::Graph module by Martien Verbruggen, which in turn generates \
graph using Lincoln Stein's GD.pm."
LICENSE = "Artistic-1.0"

PV = "0.63"

RPM_NAME = "perl-GD-Graph3d-0.63-271.21.aarch64.rpm"
RPM_HASH = "089bb49cfe478293c226333e61116d8cbf4a956adc4da5fb6bfca7b0234ebd7f4cbeb90a27023dfdb626eac0d804fae16e01e517cd1d0f37878e0964271d103b"

RPROVIDES:${PN} += "perl-GD--Graph--axestype3d \
perl-GD--Graph--bars3d \
perl-GD--Graph--cylinder \
perl-GD--Graph--cylinder3d \
perl-GD--Graph--lines3d \
perl-GD--Graph--pie3d \
perl-GD--Graph3d \
perl-GD-Graph3d \
perl-GDGraph3d"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
