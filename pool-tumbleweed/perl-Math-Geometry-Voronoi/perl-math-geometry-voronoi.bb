SUMMARY = "compute Voronoi diagrams from sets of points"
DESCRIPTION = "This module computes Voronoi diagrams from a set of input points. Info on \
Voronoi diagrams can be found here: \
 \
  http://en.wikipedia.org/wiki/Voronoi_diagram \
 \
This module is a wrapper around a C implementation found here: \
 \
  http://www.derekbradley.ca/voronoi.html \
 \
Which is itself a modification of code by Steve Fortune, the inventor of \
the algorithm used (Fortune's algorithm): \
 \
  http://cm.bell-labs.com/who/sjf/ \
 \
I made changes to the C code to allow reading input and writing output \
to/from Perl data-structures. I also modified the memory allocation code to \
use Perl's memory allocator. Finally, I changed all floats to doubles to \
provide better precision and to match Perl's NVs."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-Math-Geometry-Voronoi-1.3-3.37.aarch64.rpm"
RPM_HASH = "416cc63f225c6892c0fddb1961e49e179345acd65faae49669857bf01d2e3ff4a9d224ca3fe847db0b428843580c2028ee352654703ae0fe1b9c307b31d08db4"

RPROVIDES:${PN} += "perl-Math--Geometry--Voronoi \
perl-Math-Geometry-Voronoi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-Params--Validate"

inherit rpm
