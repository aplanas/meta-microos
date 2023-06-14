SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python39-oiffile-2022.9.29-1.3.noarch.rpm"
RPM_HASH = "c8e8144642e55a83e6ffe183d3be95ee778ef019c575920ff9b66ec7cfa474d4201eb8cc1884ac0f515509131a0ba378eee86f81eb2c42e58ad446369377de50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oiffile \
python39-oiffile \
python3dist-oiffile"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-tifffile"

inherit rpm
