SUMMARY = "Python module to run a test with multiple data sets"
DESCRIPTION = "Genty, pronounced 'gen-tee', stands for 'generate tests'. It promotes \
generative testing, where a single test can execute over a variety of \
input. Genty makes this a breeze."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python311-genty-1.3.2-5.1.noarch.rpm"
RPM_HASH = "e6a5f007bf4e1642a29931a664de9bb7f8f83393adb5f5bb347c6b33f64757f69d43b6bd94fd7f7616a46a304accee06b6a61c0daa1321e4605ce3c48ffff419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-genty \
python311-genty \
python3dist-genty"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
