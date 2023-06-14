SUMMARY = "Dirac Video Codec Decoder Library"
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

RPM_NAME = "libdirac_decoder0-1.0.2-33.27.aarch64.rpm"
RPM_HASH = "f7246d17bc642c606fc963f09a3791ee0a2014799592abd7c0e5ff46ef7039c954b5b33795ce9ed02609dc0d5d1061fc5dbdaff1e934ca5b094ff28bc3a2b6d4"

RPROVIDES:${PN} += "libdirac-decoder.so.0 \
libdirac-decoder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
