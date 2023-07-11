SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.24.1"

RPM_NAME = "python310-sphinxcontrib-plantuml-0.24.1-1.5.noarch.rpm"
RPM_HASH = "ea63916df0ce16ebe37d203ab1688b88aad2fcfcac18a7c05394083f7c03e883563a9d0cc9207718c5e3bebd985409623fb4b1d49224f56872de9c5c57dea855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-plantuml \
python310-sphinxcontrib-plantuml \
python3dist-sphinxcontrib-plantuml"

RDEPENDS:${PN} += "plantuml \
python-abi \
python310-Sphinx"

inherit rpm
