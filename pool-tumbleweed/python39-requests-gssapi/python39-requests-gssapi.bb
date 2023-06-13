SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.2.3"

RPM_NAME = "python39-requests-gssapi-1.2.3-1.6.noarch.rpm"
RPM_HASH = "5131797bb524adb60511325d20e5c77229d9448ba8e7858389e0a6ce1f6c47e05280098d119aa95f23dc47df57cb5bbd8bc51ba0acce7a0606f2ee65adfb9494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-gssapi) \
python39-requests-gssapi \
python3dist(requests-gssapi)"

RDEPENDS:${PN} += "python(abi) \
python39-gssapi \
python39-requests"

inherit rpm
