SUMMARY = "Python computational pipeline management package"
DESCRIPTION = "The Ruffus module is a way to add support for running computational pipelines."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "python39-ruffus-2.8.4-2.5.noarch.rpm"
RPM_HASH = "9166197f87bd655a9913b5e0db79d5620ab899726d701d47d4854d7b397f19b20a9960447c1c32b58a69a7bc20745b34712817edb2f2c4483f426427c23ae15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ruffus) \
python39-ruffus \
python3dist(ruffus)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
