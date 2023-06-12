SUMMARY = "Documentation files for python-six-test"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. \
 \
This package provides documentation for python-six-test."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python-six-doc-1.16.0-3.1.noarch.rpm"
RPM_HASH = "ec16a23c0e9504e8881e6088b85c82ac97742de8b65fcbbd1ad5eab4c75b3f90b4085296e273a0728d2d592934182bb17f7536218671f1634eea8d4432c0249f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-six-doc \
python310-six-doc \
python311-six-doc \
python39-six-doc"
RDEPENDS:${PN} += ""

inherit rpm
