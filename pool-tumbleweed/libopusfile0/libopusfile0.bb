SUMMARY = "A high-level API for decoding and seeking within .opus files"
DESCRIPTION = "opusfile provides a high-level API for decoding and seeking within .opus files. \
It includes: \
* Support for all files with at least one Opus stream \
  (including multichannel files or Ogg files where Opus is muxed with something else). \
* Full support, including seeking, for chained files. \
* A simple stereo downmixing API \
  (allowing chained files to be decoded with a single output format, even if the channel count changes). \
* Support for reading from a file, memory buffer, or over HTTP(S) (including seeking). \
* Support for both random access and streaming data sources."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "libopusfile0-0.12-2.4.aarch64.rpm"
RPM_HASH = "c52002bfc0d54d70b0afe627d3eac1c9271da7190d8270a5af3aa0b244f048a1197c48d0bb06771c4a3b49bf5bde830aabded5351e1110c1670fedb4e7f23615"

RPROVIDES:${PN} += "libopusfile.so.0 \
libopusfile0 \
libopusurl.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libssl.so.3"

inherit rpm
