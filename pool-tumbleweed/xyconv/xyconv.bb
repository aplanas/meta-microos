SUMMARY = "Command-line converter of files in formats supported by xylib"
DESCRIPTION = "Command-line converter of files in formats supported by xylib: \
- plain text, delimiter-separated values (e.g. CSV) \
- Crystallographic Information File for Powder Diffraction (pdCIF) \
- Siemens/Bruker UXD \
- Siemens/Bruker RAW ver. 1/2/3 \
- Philips UDF \
- Philips RD (raw scan) V3 \
- Rigaku DAT \
- Sietronics Sieray CPI \
- DBWS/DMPLOT data file \
- Canberra CNF (from Genie-2000 software; aka CAM format) \
- Canberra AccuSpec MCA \
- XFIT/Koalariet XDD \
- RIET7/LHPM/CSRIET/ILL\\_D1A5/PSI\\_DMC DAT \
- Vamas ISO14976 \
  *(only experiment modes: SEM or MAPSV or MAPSVDP are supported; \
  only REGULAR scan_mode is supported)* \
- Princeton Instruments WinSpec SPE \
  *(only 1-D data is supported)* \
- χPLOT CHI_ \
- Ron Unwin's Spectra XPS format (VGX-900 compatible)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "xyconv-1.6-1.16.aarch64.rpm"
RPM_HASH = "d07b4ce6aa34f264c587383ab775e1bd31ed4fff5e806b9afc0a7912e47b3758a388099a0815d36db9754f276e52152f479d19c325e2a371a21fb8e16a0a0bdf"

RPROVIDES:${PN} += "xyconv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxy.so.3"

inherit rpm
