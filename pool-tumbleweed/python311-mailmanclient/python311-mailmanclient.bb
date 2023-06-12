SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python311-mailmanclient-3.3.4-1.4.noarch.rpm"
RPM_HASH = "71d1e34b224211695be22cbfa14dacb12947cdb0e759272823e822477037441801750ed55a7352975e9f9993ca7c5aa33f1c8683a152917dea63bf915ea9f75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mailmanclient) \
python311-mailmanclient \
python3dist(mailmanclient)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
