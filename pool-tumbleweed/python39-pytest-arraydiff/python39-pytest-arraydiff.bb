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

RPM_NAME = "python39-pytest-arraydiff-0.5.0-1.5.noarch.rpm"
RPM_HASH = "d42ba3fbd1c599cb901a53a69ef91cd7b04756e80e2d753f1ecb167effc9d4cdf2e0e26b6e55e5f1b9dea6d4bbf71b978540cb26dadc937c1fd747cf0b1c2c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-arraydiff \
python39-pytest-arraydiff \
python3dist-pytest-arraydiff"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-pytest"

inherit rpm
