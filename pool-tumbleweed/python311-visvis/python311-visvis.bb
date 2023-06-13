SUMMARY = "An object oriented approach to visualization of 1D to 4D data"
DESCRIPTION = "Visvis is a Python library for visualization of 1D to 4D data in an \
object oriented way. Essentially, visvis is an object oriented layer \
of Python on top of OpenGl. A Matlab/Matplotlib-like interface in the \
form of a set of functions allows creation of objects (e.g. plot(), \
imshow(), volshow(), surf())."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python311-visvis-1.13.0-1.13.noarch.rpm"
RPM_HASH = "62d4765cd407b12385694b056045e32c2bba01b0f9be4f5310bceae2f064ef429964fefdeff113d7f93b7f7253f3882cc18ed488c57ce524fb8c776b142dd5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(visvis) \
python311-visvis \
python3dist(visvis)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-opengl \
python311-qt5"

inherit rpm
