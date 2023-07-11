SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.5"

RPM_NAME = "python310-mailmanclient-3.3.5-1.1.noarch.rpm"
RPM_HASH = "fb921d7d663e567c4c7db89c8cbad56758e6d65d4d47aecb370aec34522695f9cc47cc3d3a3f3ec356aa8ff2e41379fc62d5dc1ea8cf5dafda47ae64d5e04895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mailmanclient \
python310-mailmanclient \
python3dist-mailmanclient"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
