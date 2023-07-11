SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python311-oiffile-2022.9.29-1.5.noarch.rpm"
RPM_HASH = "7f7030d6edc78d1796e3ff7f36456c07f14084d5fc16feab75a9a792379f7662d6ce8e55d173c7e8c2c50df64a44abe5912ef04cf802cb122e65d02f14a610e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oiffile \
python3.11dist-oiffile \
python311-oiffile \
python3dist-oiffile"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-tifffile"

inherit rpm
