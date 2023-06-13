SUMMARY = "Zinnia model files trained with data provided by Tomoe"
DESCRIPTION = "zinnia provides hand recognization model to Zinnia. This model \
supports Japanese and simplified Chinese."
LICENSE = "LGPL-2.1"

PV = "0.6.0"

RPM_NAME = "zinnia-tomoe-0.6.0-7.16.noarch.rpm"
RPM_HASH = "cabe9bd80dad7f374da619c18deb506df3bd6afd5b7cd61e667de60acad66f4e3b0c5c14f08f36c11ddd5f290460008a46b8375f2a4e28193df6a6cf18750b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zinnia-tomoe"

RDEPENDS:${PN} += ""

inherit rpm
