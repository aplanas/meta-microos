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

RPM_NAME = "dirac-devel-1.0.2-33.28.aarch64.rpm"
RPM_HASH = "03e58c5999f2798aec1bf9fb3d80ce5e4ed3ada2745fc1a9e4bf6079cddf1b77ed8d3f56243bd284f865f297e6b8d5fc87098b630a119cb004d0a06a115e10ea"

RPROVIDES:${PN} += "dirac-devel \
libdirac-devel \
pkgconfig-dirac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdirac-decoder0 \
libdirac-encoder0"

inherit rpm
