SUMMARY = "A viewer package for PyTables"
DESCRIPTION = "ViTables is a graphical tool for browsing and editing files in both \
PyTables and HDF5 format. With ViTables you can easily navigate \
through the data hierarchy, view and modify metadata, view actual data \
and more."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "ViTables-3.0.2-1.11.noarch.rpm"
RPM_HASH = "08a817568e3512719a4e18a0f262bc7434c5c84ed13aacf287bce9e39f1cc61de7ef28ba9bc0b0f30198d32b5662037bdb338b630985c6635244ede2fe1a994a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ViTables \
ViTables2 \
python3.10dist(vitables) \
python3dist(vitables)"
RDEPENDS:${PN} += "/usr/bin/python3 \
hdf5 \
hicolor-icon-theme \
python(abi) \
python3-Cython \
python3-QtPy \
python3-numexpr \
python3-numpy \
python3-qt5 \
python3-tables"

inherit rpm
