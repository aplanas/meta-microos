SUMMARY = "Python module to run a test with multiple data sets"
DESCRIPTION = "Genty, pronounced 'gen-tee', stands for 'generate tests'. It promotes \
generative testing, where a single test can execute over a variety of \
input. Genty makes this a breeze."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python310-genty-1.3.2-5.1.noarch.rpm"
RPM_HASH = "073d064c65952dd465d88dd2cdb3acd046c40e463f44274ea448a0053837771801a70486f43a93adf55a2eb3bb1ec450bf3ed284c5ab12b40d0d4b0b88a7d00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genty \
python3.10dist(genty) \
python310-genty \
python3dist(genty)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
