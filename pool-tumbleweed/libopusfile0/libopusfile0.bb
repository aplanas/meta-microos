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

RPM_NAME = "libopusfile0-0.12-2.3.aarch64.rpm"
RPM_HASH = "d7b36fa59460205e5f381d09fd24c945b58cec019c5dcb22d74835d8810b4df1d27a14f6202193371d8e52c879f9bb05f71652f10a934677f05f77e9b2461513"

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
