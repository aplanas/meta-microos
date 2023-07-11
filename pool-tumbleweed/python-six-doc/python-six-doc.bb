SUMMARY = "Documentation files for python-six-test"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. \
 \
This package provides documentation for python-six-test."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python-six-doc-1.16.0-3.2.noarch.rpm"
RPM_HASH = "1d59a8c5a99c47917a671264a5e09fec8ec4558dd0997e9dbf76ac40cbd468c926ccc07e99da7734c47efefb57fbc250bf0236bcf9a12cf126a241e90a7679de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-six-doc \
python310-six-doc \
python311-six-doc \
python39-six-doc"

RDEPENDS:${PN} += ""

inherit rpm
