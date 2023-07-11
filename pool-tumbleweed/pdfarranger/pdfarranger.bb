SUMMARY = "Merge, split, rotate, crop, and rearrange pages of PDF documents"
DESCRIPTION = "pdfarranger is a small python-gtk application, which helps the user \
to merge or split pdf documents and rotate, crop and rearrange their \
pages using a graphical interface. It is a frontend for pikepdf. \
 \
pdfarranger is a fork of Konstantinos Poulios’s pdfshuffler. It is \
a humble attempt to make the project a bit more active."
LICENSE = "GPL-3.0-only"

PV = "1.9.2"

RPM_NAME = "pdfarranger-1.9.2-1.3.noarch.rpm"
RPM_HASH = "be1b63c6a573d001d6c90d8d07622d5b63711e27b7a16634ecc17ea658f3aaef34e5eb353d77caa71086daa621bf1152cd0e4e6e373bd9d8af832ab35547ca07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfarranger \
python3.11dist-pdfarranger \
python3dist-pdfarranger"

RDEPENDS:${PN} += "/usr/bin/python3 \
gtk3 \
python-abi \
python3-cairo \
python3-dateutil \
python3-gobject-Gdk \
python3-pikepdf \
typelib-1-0-Gtk-3-0 \
typelib-1-0-Poppler-0-18"

inherit rpm
