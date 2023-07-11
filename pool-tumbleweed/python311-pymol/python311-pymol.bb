SUMMARY = "A Molecular Viewer"
DESCRIPTION = "PyMOL is a molecular graphics system targetted at medium to large \
biomolecules like proteins. It can generate molecular graphics \
images and animations. \
 \
Features include: \
 \
* Visualization of molecules, molecular trajectories and surfaces \
  of crystallography data or orbitals \
* Molecular builder and sculptor \
* Internal raytracer and movie generator \
* Fully extensible and scriptable via a python interface \
 \
The file formats PyMOL can read include PDB, XYZ, CIF, MDL Molfile, \
ChemDraw, CCP4 maps, XPLOR maps and Gaussian cube maps."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python311-pymol-2.4.0-3.20.aarch64.rpm"
RPM_HASH = "022b3413c96fcf6af4c01eba1b0c3404be851bb9cd01d7ba70d49d585b6589d47fac860a2e6d76bf9bd74133d2ea93196f0064b62cc87369b3445fc1455b6dc8"

RPROVIDES:${PN} += "pymol \
python3-pymol \
python3.11dist-pymol \
python311-pymol \
python3dist-pymol"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnetcdf.so.19 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.2 \
python-abi \
python311-numpy \
python311-qt5 \
update-alternatives"

inherit rpm
