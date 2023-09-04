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

RPM_NAME = "python39-pymol-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "4465ac2bf8ad8c2da447a2bac33315fc05d52357050d27e702866ddfac17f17d4191ca64e2607734dd3f5246e762321644db6bf0fd6f9b5f005fc715f010fb55"

RPROVIDES:${PN} += "pymol \
python3.9dist-pymol \
python39-pymol \
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
python39-numpy \
python39-pmw \
python39-qt5 \
update-alternatives"

inherit rpm
