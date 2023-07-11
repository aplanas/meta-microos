SUMMARY = "Dirac Video Codec Encoder Library"
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

RPM_NAME = "libdirac_encoder0-1.0.2-33.28.aarch64.rpm"
RPM_HASH = "1e1cb9482fcdbc8eb3365e7c8ec60d3d436fdecffef79230d7570b7a0e40722ba2def1e1e81e7ed373fe7532a022f74b5a7026aed9fc614c74e153e883d332ad"

RPROVIDES:${PN} += "libdirac-encoder.so.0 \
libdirac-encoder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
