SUMMARY = "Wrapper for audio decoding via selectable backends"
DESCRIPTION = "Decode audio files using whichever backend is available. The library \
currently supports: \
 \
- Gstreamer via PyGObject. \
- MAD via the pymad bindings. \
- FFmpeg or Libav via its command-line interface. \
- The standard library wave, aifc, and sunau modules (for \
  uncompressed audio formats)."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-audioread-3.0.0-1.6.noarch.rpm"
RPM_HASH = "d2dc655e5ac3252dbb70b31490eabb84790812a3c45314fb34bff4186fab93c0f8ea06ad0ccdd4b057dd45604c679b7485eecc7c26f862b94e7f9ae8adbb13c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audioread \
python3.11dist-audioread \
python311-audioread \
python3dist-audioread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
