SUMMARY = "Audio files and ID3 Manipulation Tool"
DESCRIPTION = "eyeD3 is a Python tool for working with audio files, specifically MP3 \
files containing ID3 metadata (i.e. song info). \
 \
Features: \
- Python package for writing application and/or plugins. \
- Command-line tool driver script that supports plugins. viewer/editor \
  interface. \
- Easy editing/viewing of audio metadata from the command-line, using the \
  ‘classic’ plugin. \
- Support for ID3 versions 1.x, 2.2 (read-only), 2.3, and 2.4. \
- Support for the MP3 audio format exposing details such as play time, \
  bit rate, sampling frequency, etc. \
- Abstract design allowing future support for different audio formats and \
  metadata containers."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "eyeD3-0.9.7-1.2.noarch.rpm"
RPM_HASH = "5f79f0743be9928291b1eba0cdf38e83e38e7a67120a82df2d2ca219ff74d9021d0dad6e3ba7a8d554a6e05f934af584b9015f35dad42ada79e82fc08272ae88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eyeD3 \
python3.10dist(eyed3) \
python3dist(eyed3)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-chardet \
python3-colorama \
python3-deprecation \
python3-filetype \
python3-idna \
python3-packaging \
python3-pyparsing \
python3-requests \
python3-six \
python3-toml \
python3-urllib3"

inherit rpm
