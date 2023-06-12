SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-rst.linker-2.4.0-1.1.noarch.rpm"
RPM_HASH = "b2e2330ebe1149808ebae601cd2440d60e1eb3eff0b3c7a39091edbfbf8b2c78547fcca6faa403d2063238d4520a45eca5aaf5046f0e05340a76e61accb921a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rst.linker \
python3.10dist(rst.linker) \
python310-rst.linker \
python3dist(rst.linker)"
RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil"

inherit rpm
