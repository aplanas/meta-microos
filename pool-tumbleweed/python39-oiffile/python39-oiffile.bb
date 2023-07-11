SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python39-oiffile-2022.9.29-1.5.noarch.rpm"
RPM_HASH = "3f5df13bb796cb104f61d32a39aa88720ae6d0dd87962eb33dcd05e6c3192b6882dc209dc0f33d0de98b53961e96b88bd67ad6075bdefadf0296e86775cf8ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oiffile \
python39-oiffile \
python3dist-oiffile"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-tifffile"

inherit rpm
