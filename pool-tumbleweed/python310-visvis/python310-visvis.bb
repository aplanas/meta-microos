SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python310-visvis-1.13.0-1.13.noarch.rpm"
RPM_HASH = "c520d5984a0a1071bd2f1bb2c06dba1f51f0ed44672bfb15b4be281899e479d13d11bdb3b2973ba5cbd8c779eb08d64fe4cc8704a5806f767bb251faf1e0e588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-visvis \
python3.10dist(visvis) \
python310-visvis \
python3dist(visvis)"
RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-opengl \
python310-qt5"

inherit rpm
