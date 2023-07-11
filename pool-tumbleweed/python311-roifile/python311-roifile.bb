SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2020.11.28"

RPM_NAME = "python311-roifile-2020.11.28-1.10.noarch.rpm"
RPM_HASH = "2bad9aba1a0c7ec3ddbfcab05f93aa65a96afa89611245ae8e25d5d2aee746bedc71be857fb420dd96b584729754238fc037dfe95c0d9662a5513e7ef74e1f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roifile \
python3.11dist-roifile \
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
