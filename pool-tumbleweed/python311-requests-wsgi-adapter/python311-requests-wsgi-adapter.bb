SUMMARY = "WSGI Transport Adapter for Requests"
DESCRIPTION = "WSGI Transport Adapter for Requests"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python311-requests-wsgi-adapter-0.4.1-2.1.noarch.rpm"
RPM_HASH = "0810fcac763db24d27488bd1bfc509d0b48966cafe9578cdd363cff6cee5ba899d5013038b874d25e5cb97db453e773db739ed19be6e635c1f8e39a3a42c0f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-wsgi-adapter \
python3.11dist-requests-wsgi-adapter \
python311-requests-wsgi-adapter \
python3dist-requests-wsgi-adapter"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
