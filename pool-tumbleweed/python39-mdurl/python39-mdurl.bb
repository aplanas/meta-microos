SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-mdurl-0.1.2-2.3.noarch.rpm"
RPM_HASH = "67cb72d0d7cd91fb39e721ca80978dd4118ce467396821b4af4ed98fb88e927476bdc16573200abf80f7c0b18f478443e5c5c23abb560515b933b41ce6d3abee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mdurl \
python39-mdurl \
python3dist-mdurl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
