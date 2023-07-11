SUMMARY = "Read Olympus(r) image files (OIF and OIB)"
DESCRIPTION = "Oiffile is a Python library to read image and metadata from Olympus Image \
Format files. OIF is the native file format of the Olympus FluoView(tm) \
software for confocal microscopy."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python310-oiffile-2022.9.29-1.5.noarch.rpm"
RPM_HASH = "a775896296063734011bf8e2bde3cf1f97e80d86bba86c6149ad431540fb49a7cba4abbe529d0e0274039264e32289d1bf24f57769755684a4ed00e9f630adf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oiffile \
python310-oiffile \
python3dist-oiffile"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-tifffile"

inherit rpm
