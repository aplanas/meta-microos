SUMMARY = "Python module to run a test with multiple data sets"
DESCRIPTION = "Genty, pronounced 'gen-tee', stands for 'generate tests'. It promotes \
generative testing, where a single test can execute over a variety of \
input. Genty makes this a breeze."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python311-genty-1.3.2-5.3.noarch.rpm"
RPM_HASH = "6be0b2e240c3ab9ad18dbcae33ea258d9c8cd695411fe9b350d4bdec8caa4e2054cfb1b6ad2384bcb1726b8a14fe0bf0275770129b7be745bc0e45b66bb8cc22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genty \
python3.11dist-genty \
python311-genty \
python3dist-genty"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
