SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python311-visvis-1.13.0-1.15.noarch.rpm"
RPM_HASH = "63ca6449a14c26dce142d84431e30299c3f706cc1f34be60dd2201f1b35d871e7d8c0ab08687f9d15edb9e5d3f32347abef529e1c2519a99b55f39fceaca14f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-visvis \
python3.11dist-visvis \
python311-visvis \
python3dist-visvis"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-opengl \
python311-qt5"

inherit rpm
