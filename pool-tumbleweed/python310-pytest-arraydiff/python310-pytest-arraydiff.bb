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

RPM_NAME = "python310-pytest-arraydiff-0.5.0-1.5.noarch.rpm"
RPM_HASH = "80528eb286917a2b74bd57ee622491c221899865f971cb333edc6249d69eaf9a2a1841fc95afaad7ed3c3f0f00c70edebd905e8b1f08f7d60dd2ad8788ce1e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-arraydiff \
python310-pytest-arraydiff \
python3dist-pytest-arraydiff"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-pytest"

inherit rpm
