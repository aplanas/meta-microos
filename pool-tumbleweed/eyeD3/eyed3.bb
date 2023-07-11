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

RPM_NAME = "eyeD3-0.9.7-1.3.noarch.rpm"
RPM_HASH = "417f90a3acbcb31182d49cad86ccdaac9ae5acaf46aacd65e85192e94136c5008e8fede6096e68459e2ed544b80ea6759a20f137e826ea9a041afda9a6e94aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eyeD3 \
python3.11dist-eyed3 \
python3dist-eyed3"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
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
