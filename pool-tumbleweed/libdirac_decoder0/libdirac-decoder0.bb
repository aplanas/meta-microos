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

RPM_NAME = "libdirac_decoder0-1.0.2-33.28.aarch64.rpm"
RPM_HASH = "a0e2d6f9e8c91727708be78387cddcd0b7aa80c57f5164dd7c40241a7cc492824f22eedbd9ec01868f17ad5cd7d9693cc2c0914ecda626da32ddff58e51ea820"

RPROVIDES:${PN} += "libdirac-decoder.so.0 \
libdirac-decoder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
