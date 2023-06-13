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

RPM_NAME = "python311-pymol-2.4.0-3.19.aarch64.rpm"
RPM_HASH = "737a14f2293a0e12d95a0d8cd96170f390510587abaa057828f09032908e1600202a8648768c373ff706fa62474af8e320883107bf3c064600cb9e2ea286d474"

RPROVIDES:${PN} += "pymol \
python3.11dist(pymol) \
python311-pymol \
python311-pymol(aarch-64) \
python3dist(pymol)"

RDEPENDS:${PN} += "/bin/csh \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libnetcdf.so.19()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
python(abi) \
python311-numpy \
python311-qt5 \
update-alternatives"

inherit rpm
