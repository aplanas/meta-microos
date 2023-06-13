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

RPM_NAME = "python311-pytest-arraydiff-0.5.0-1.3.noarch.rpm"
RPM_HASH = "29a3dbd132a9ea5005193f909d98cae403937e7f0b3c916fd607097a2164083526f582be6bea2e1f517a2a785b27be92ac97063156e449136fbcf9065e3b1c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-arraydiff) \
python311-pytest-arraydiff \
python3dist(pytest-arraydiff)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-pytest"

inherit rpm
