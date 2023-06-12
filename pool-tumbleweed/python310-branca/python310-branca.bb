SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-branca-0.6.0-2.3.noarch.rpm"
RPM_HASH = "dcbf28e88a9c4f4bd8cefa26c477f9a69fba8e939b0182359c644db6c15f5bda5e9f0263f1feae03460f7cc0dbf1c8a9ba9b124b20b3d4bfec19d38de18114d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-branca \
python3.10dist(branca) \
python310-branca \
python3dist(branca)"
RDEPENDS:${PN} += "python(abi) \
python310-Jinja2"

inherit rpm
