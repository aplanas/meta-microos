SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python310-oiffile-2022.9.29-1.3.noarch.rpm"
RPM_HASH = "9e7723fca4bce06402f670051f4ca7abc276c779cc6bf92fed82269b6ce64607fb05563c45fe22aff83466a0d9c619ba5d3ecacc4d6cd71c86b009e88423322b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oiffile \
python3.10dist(oiffile) \
python310-oiffile \
python3dist(oiffile)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-tifffile"

inherit rpm
