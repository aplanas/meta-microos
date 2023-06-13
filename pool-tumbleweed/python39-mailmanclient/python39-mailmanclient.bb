SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python39-mailmanclient-3.3.4-1.4.noarch.rpm"
RPM_HASH = "4ac616ccb419318baad41c66f8c6ebf25838414f9916e9d30d4fe1d901a8519b371ec01694174497828ffae153ce1f8a9014aed59580860dabfb68e6a1db4d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mailmanclient) \
python39-mailmanclient \
python3dist(mailmanclient)"

RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
