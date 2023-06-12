SUMMARY = "Pegasus Workflow Management System Python Commons"
DESCRIPTION = "This package contains common files for the Python APIs for Pegasus WMS."
LICENSE = "Apache-2.0"

PV = "5.0.3"

RPM_NAME = "python39-pegasus-wms.common-5.0.3-2.3.noarch.rpm"
RPM_HASH = "47996f428e745055f94f89580c0d68cdb896dab509a2f629bb2c7ea61773ef7c37af1c6ca67da880e2642519383ea180da2089bcc498358eba360001ebd3575a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pegasus-wms.common) \
python39-pegasus-wms.common \
python3dist(pegasus-wms.common)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML"

inherit rpm
