SUMMARY = "Pytest plugin to help with comparing array output from tests"
DESCRIPTION = "This is a py.test plugin to facilitate the generation and comparison of \
data arrays produced during tests. \
 \
The basic idea is that you can write a test that generates a Numpy array (or \
other related objects depending on the format). You can then either run the \
tests in a mode to generate reference files from the arrays, or you can run \
the tests in comparison mode, which will compare the results of the tests to \
the reference ones within some tolerance. \
 \
At the moment, the supported file formats for the reference files are: \
 \
-  A plain text-based format (baSed on Numpy loadtxt output) \
-  The FITS format (requires astropy). With this format, tests \
   can return either a Numpy array for a FITS HDU object."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-arraydiff-0.5.0-1.5.noarch.rpm"
RPM_HASH = "caf8a9c9a5b9eacfdf591fd9266f7b1d51d459bfb91f31c2d145a82b5dd251aaf8f42f204b6818802276fd10722a50835176460f8bdd45acc5239098c457db8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-arraydiff \
python3.11dist-pytest-arraydiff \
python311-pytest-arraydiff \
python3dist-pytest-arraydiff"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-pytest"

inherit rpm
