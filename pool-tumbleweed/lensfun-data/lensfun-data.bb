SUMMARY = "Data files for lensfun/lensfun-devel"
DESCRIPTION = "The goal of the lensfun library is to provide a open source database \
of photographic lenses and their characteristics. In the past there \
was a effort in this direction (see http://www.epaperpress.com/ptlens/), \
but then author decided to take the commercial route and the database \
froze at the last public stage. This database was used as the basement \
on which lensfun database grew, thanks to PTLens author which gave his \
permission for this, while the code was totally rewritten from scratch \
(and the database was converted to a totally new, XML-based format). \
 \
The lensfun library not only provides a way to read the database and \
search for specific things in it, but also provides a set of algorithms \
for correcting images based on detailed knowledge of lens properties \
and calibration data. Right now lensfun is designed to correct distortion, \
transversal (also known as lateral) chromatic aberrations, vignetting \
and colour contribution index of the lens."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-data-0.3.3-1.7.noarch.rpm"
RPM_HASH = "4bd9d0ed4b1801f628374f971870b2b1c512b2f2abcb055ae4c92579139de62238b48bd53c1356076944dbab661ccbb7612079228c0b04df1c8b7a47440ddf3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lensfun-data"

RDEPENDS:${PN} += ""

inherit rpm
