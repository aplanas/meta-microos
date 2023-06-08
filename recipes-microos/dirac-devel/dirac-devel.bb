SUMMARY = "Development Files for Dirac Video Codec"
DESCRIPTION = "Dirac is an open source video codec. It uses a traditional hybrid video \
codec architecture, but with the wavelet transform instead of the usual \
block transforms.  Motion compensation uses overlapped blocks to reduce \
block artefacts that would upset the transform coding stage. \
 \
Dirac can code just about any size of video, from streaming up to HD \
and beyond, although certain presets are defined for different \
applications and standards.  These cover the parameters that need to be \
set for the encoder to work, such as block sizes and temporal \
prediction structures, which must otherwise be set by hand."
LICENSE = "MPL-1.1"

PV = "1.0.2"

RPM_NAME = "dirac-devel-1.0.2-33.27.aarch64.rpm"
RPM_HASH = "489a5ee079449c2bdc4f25cb72f1a79a20c9d886443f71bd5f4258a26794e73d73fdf72498cb217340f41c9f55839a3cc413f504ba0c270eac5f0e736c13bb35"

RPROVIDES:${PN} += "dirac-devel dirac-devel(aarch-64) libdirac-devel pkgconfig(dirac)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdirac_decoder0 libdirac_encoder0"

inherit rpm
