SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-clikit-0.6.2-2.16.noarch.rpm"
RPM_HASH = "94eff32a4bd7892cd31ec028146c7d9f792db0f17d7fe329db95956f998df913a24da72e78dae0c5313feed7d2989f22324e2ca31499b26d42eb998413aad7ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clikit \
python3.10dist(clikit) \
python310-clikit \
python3dist(clikit)"

RDEPENDS:${PN} += "python(abi) \
python310-crashtest \
python310-pastel \
python310-pylev"

inherit rpm
