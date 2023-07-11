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

RPM_NAME = "perl-Math-Geometry-Voronoi-1.3-3.36.aarch64.rpm"
RPM_HASH = "6e32b901366661517518b9f926ad5481c2e8887ffb89bb10b0efba1ba6f9816172576ebc28b3acb6e8203425c2f83d1ef24976d5ccef13a9a0a062e5b036c318"

RPROVIDES:${PN} += "perl-Math--Geometry--Voronoi \
perl-Math-Geometry-Voronoi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor \
perl-Params--Validate"

inherit rpm
