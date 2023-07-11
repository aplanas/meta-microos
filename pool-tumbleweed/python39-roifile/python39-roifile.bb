SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2020.11.28"

RPM_NAME = "python39-roifile-2020.11.28-1.10.noarch.rpm"
RPM_HASH = "9bed30c17a29f3d10873d5fac9c84c4d74c7756ee3fe7aaed5b89d715174dc88b3aafc43675ffb0a24d11005efb0abe0cc9b9672af86794bf86eeb58a778b679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-roifile \
python39-roifile \
python3dist-roifile"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-matplotlib \
python39-numpy \
python39-tifffile \
update-alternatives"

inherit rpm
