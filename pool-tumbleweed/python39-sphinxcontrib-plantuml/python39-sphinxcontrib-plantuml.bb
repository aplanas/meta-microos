SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.24.1"

RPM_NAME = "python39-sphinxcontrib-plantuml-0.24.1-1.5.noarch.rpm"
RPM_HASH = "a7d108cc69d72b2586fb580723210e99a27b6d295a0558fd0f84c8a109a02504e2b1be0654f7a215ad567d37a2f38e4c64e36d5a56e46709fba1d81f500c8428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-plantuml \
python39-sphinxcontrib-plantuml \
python3dist-sphinxcontrib-plantuml"

RDEPENDS:${PN} += "plantuml \
python-abi \
python39-Sphinx"

inherit rpm
