SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2020.11.28"

RPM_NAME = "python311-roifile-2020.11.28-1.8.noarch.rpm"
RPM_HASH = "83e8038bffa2a312c7d1a30633d4207059a507c21ca2ee2b640376096b29127c8a298fcfe0dea5c300272c732b4c4415b7eb1891c84a770dfb734615efc36a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-roifile \
python311-roifile \
python3dist-roifile"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-matplotlib \
python311-numpy \
python311-tifffile \
update-alternatives"

inherit rpm
