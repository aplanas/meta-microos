SUMMARY = "Merge, split, rotate, crop, and rearrange pages of PDF documents"
DESCRIPTION = "pdfarranger is a small python-gtk application, which helps the user \
to merge or split pdf documents and rotate, crop and rearrange their \
pages using a graphical interface. It is a frontend for pikepdf. \
 \
pdfarranger is a fork of Konstantinos Poulios’s pdfshuffler. It is \
a humble attempt to make the project a bit more active."
LICENSE = "GPL-3.0-only"

PV = "1.10.0"

RPM_NAME = "pdfarranger-1.10.0-1.1.noarch.rpm"
RPM_HASH = "2cb623bcd1b6cbc9cfb844d5d9e2a6c554965f204a4fa182aae53dad88c9e49f5533745d73f211b1ba2fe44cfbc72ef0cef0d5de78ea8f84ac937909bd35e79c"
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
