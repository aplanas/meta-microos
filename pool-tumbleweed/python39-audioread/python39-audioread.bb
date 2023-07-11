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

RPM_NAME = "python39-audioread-3.0.0-1.6.noarch.rpm"
RPM_HASH = "77d4b985f1d654abd2265b9177dfb809fb77dfc8d7ccdfa0fc1667c4b961e2756ebf5bec16991bef82b38d9ca58edfabfeca9a830ea47c255ae6a647ba898ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-audioread \
python39-audioread \
python3dist-audioread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
