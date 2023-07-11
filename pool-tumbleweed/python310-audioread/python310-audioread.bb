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

RPM_NAME = "python310-audioread-3.0.0-1.6.noarch.rpm"
RPM_HASH = "4316f3da76523f454cf48163444d570b658c43384f9828aa266a1b50d9571e4499fd7802088da7cd6f793eb2990d0507ad9727bf9d37275a446ba80b56692318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-audioread \
python310-audioread \
python3dist-audioread"

RDEPENDS:${PN} += "python-abi"

inherit rpm
