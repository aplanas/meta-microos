SUMMARY = "Python module to run a test with multiple data sets"
DESCRIPTION = "Genty, pronounced 'gen-tee', stands for 'generate tests'. It promotes \
generative testing, where a single test can execute over a variety of \
input. Genty makes this a breeze."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python39-genty-1.3.2-5.1.noarch.rpm"
RPM_HASH = "e24cf51841e0b4d583a97079c7b65cf4d66d36a1e038804caa01947859bddb573eb71d3f93665b8a734e31f5c16fa36c88f17d7d3b506a7b55895c63a6e834da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(genty) \
python39-genty \
python3dist(genty)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
