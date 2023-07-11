SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python310-visvis-1.13.0-1.15.noarch.rpm"
RPM_HASH = "37eeeaff3051d7a5c21257a9a915d513f2f44debfecd82591c132236150386ea4efbda3c77e566448aedc9c2ce25190f014658fd6a83b4634187a3d917ce1c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-visvis \
python310-visvis \
python3dist-visvis"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-opengl \
python310-qt5"

inherit rpm
