SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.24.1"

RPM_NAME = "python39-sphinxcontrib-plantuml-0.24.1-1.3.noarch.rpm"
RPM_HASH = "eaad01b877f4af8e07483f077f67c8e9c8232d5d3bea26fcd33ea226fb9f1245b6619e7d2048ce38be9dce8762480ad7623ebced1c9d770361a06f43acba81aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-plantuml) \
python39-sphinxcontrib-plantuml \
python3dist(sphinxcontrib-plantuml)"

RDEPENDS:${PN} += "plantuml \
python(abi) \
python39-Sphinx"

inherit rpm
