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

RPM_NAME = "python310-pymol-2.4.0-3.19.aarch64.rpm"
RPM_HASH = "76aa0bc4e3feb1d2f3c100fef4a0ff3a7617044ee505de0cd907797a0dc7ca5232d584d396c8065e2ee6ff398444b5301d1f5882842bd41ccb960f3e4a9bf000"

RPROVIDES:${PN} += "pymol \
python3-pymol \
python3.10dist-pymol \
python310-pymol \
python3dist-pymol"

RDEPENDS:${PN} += "/bin/csh \
/bin/sh \
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
python310-numpy \
python310-qt5 \
update-alternatives"

inherit rpm
