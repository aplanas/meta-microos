SUMMARY = "A viewer package for PyTables"
DESCRIPTION = "ViTables is a graphical tool for browsing and editing files in both \
PyTables and HDF5 format. With ViTables you can easily navigate \
through the data hierarchy, view and modify metadata, view actual data \
and more."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "ViTables-3.0.2-1.12.noarch.rpm"
RPM_HASH = "91f28686175d796bc1ea0fe4faab16aecfda074f06bae8915e1a9331285ad2c53c1082c6e369461e5b007c286624c2265638fe0be0ded2485b2f2a546f68baf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ViTables \
ViTables2 \
python3.11dist-vitables \
python3dist-vitables"

RDEPENDS:${PN} += "/usr/bin/python3 \
hdf5 \
hicolor-icon-theme \
python-abi \
python3-Cython \
python3-QtPy \
python3-numexpr \
python3-numpy \
python3-qt5 \
python3-tables"

inherit rpm
