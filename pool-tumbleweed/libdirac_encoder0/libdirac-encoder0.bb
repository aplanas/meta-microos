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

RPM_NAME = "libdirac_encoder0-1.0.2-33.27.aarch64.rpm"
RPM_HASH = "700fb32abf8321c8fb8e29b6defaf2ec5c72ad2ef2d9104f2d52c81351e4a8e15d7d69c39d4bdd1104c9ad0e736f5a3106c0933be00c274901ca5c8aa4b7a157"

RPROVIDES:${PN} += "libdirac-encoder.so.0 \
libdirac-encoder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
