SUMMARY = "The Dirac_Video Codec"
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

RPM_NAME = "dirac-1.0.2-33.28.aarch64.rpm"
RPM_HASH = "e3079cbf8b1f96f1a6e54e440b655dd73bbf93e127cdcaf8bccb775cf18352e88bde2cf4d2faace0767b2f606dcc2b72462d5c5acecfe68d77aef05c4512924b"

RPROVIDES:${PN} += "dirac"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcppunit-1.15.so.1 \
libdirac-decoder.so.0 \
libdirac-encoder.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
