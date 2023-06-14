SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.24.1"

RPM_NAME = "python310-sphinxcontrib-plantuml-0.24.1-1.3.noarch.rpm"
RPM_HASH = "78307d7ea7647a268f92300768eda346d79bb3fe2c45a896cd4dd180757d97499a72441669c7dd0ed1f3afe2ee369a981f1049e6cb37a82971b3b13c38a25a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-plantuml \
python3.10dist-sphinxcontrib-plantuml \
python310-sphinxcontrib-plantuml \
python3dist-sphinxcontrib-plantuml"

RDEPENDS:${PN} += "plantuml \
python-abi \
python310-Sphinx"

inherit rpm
