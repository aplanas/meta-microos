SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python39-visvis-1.13.0-1.15.noarch.rpm"
RPM_HASH = "d1f47126f403d5373f87039286fb1f4915f979b926e806c2c2d4200eb9745708c2e144b58b9526d24e4c707ea46c80901f74e1f42241419b5f98825b6f32afa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-visvis \
python39-visvis \
python3dist-visvis"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-opengl \
python39-qt5"

inherit rpm
