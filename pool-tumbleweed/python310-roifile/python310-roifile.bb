SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2020.11.28"

RPM_NAME = "python310-roifile-2020.11.28-1.10.noarch.rpm"
RPM_HASH = "3c5348d26a26474f4ed73376026996d11cae48af35cba59de98cfa790a0529841fa816160dcd1732dce9e153707cff741328c8e7baa3b894a5fba4f261a37ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-roifile \
python310-roifile \
python3dist-roifile"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-matplotlib \
python310-numpy \
python310-tifffile \
update-alternatives"

inherit rpm
