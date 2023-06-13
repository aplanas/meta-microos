SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python310-purl-1.6-2.1.noarch.rpm"
RPM_HASH = "14ec33e2a3c0ebcf5ae31f6b2112f327f592e370d2a0c9bcef3e92269bb3979001a0c72d483540630161aef455d8ce3a6a3a6936efb2c48abcf63641cfdc473e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-purl \
python3.10dist(purl) \
python310-purl \
python3dist(purl)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
