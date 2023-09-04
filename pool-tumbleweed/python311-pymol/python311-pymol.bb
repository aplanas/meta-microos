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

PV = "2.5.0"

RPM_NAME = "python311-pymol-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "bbeb7f29f1ac19263b529629e6d2cf34853f41742a57a43f9a326d1e744c8069190ba3946fa63cb9dd8023ee53fc940802a70706ba487c842dded3e55f2c86fb"

RPROVIDES:${PN} += "pymol \
python3-pymol \
python3.11dist-pymol \
python311-pymol \
python3dist-pymol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libnetcdf.so.19 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.2 \
python-abi \
python311-numpy \
python311-pmw \
python311-qt5 \
update-alternatives"

inherit rpm
