SUMMARY = "Sphinx API for Web Apps"
DESCRIPTION = "Once you enable this extension, a very simple string like this: \
 \
    'Alice -> Bob: Hi!' \
 \
will create a nice UML schema. WIth PlantUML, you can specify things like height, width, scale, caption and so on. For details, please see PlantUML documentation at: http://plantuml.sourceforge.net/."
LICENSE = "BSD-2-Clause"

PV = "0.24.1"

RPM_NAME = "python311-sphinxcontrib-plantuml-0.24.1-1.5.noarch.rpm"
RPM_HASH = "66a098dba0c2a70f852b27cbbe001e14c0a501604c7c88be70129874c37159bfa07a28209dec74e795ef3c2225fa11fc2ffc0a3c1b9922d7ef370f3ac6b1fc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-plantuml \
python3.11dist-sphinxcontrib-plantuml \
python311-sphinxcontrib-plantuml \
python3dist-sphinxcontrib-plantuml"

RDEPENDS:${PN} += "plantuml \
python-abi \
python311-Sphinx"

inherit rpm
