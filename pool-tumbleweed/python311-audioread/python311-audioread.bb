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

RPM_NAME = "python311-audioread-3.0.0-1.4.noarch.rpm"
RPM_HASH = "6769456d045a018db0b2c81ebabb694fd33f6dbc6c4020a6f6825490614dcd8000ab4734978f0c203077dcb65a38e13ccc1b7305122da086711589fd0a64145e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(audioread) \
python311-audioread \
python3dist(audioread)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
