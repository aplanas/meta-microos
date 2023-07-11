SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-authres-1.2.0-2.1.noarch.rpm"
RPM_HASH = "3c2fca795c9a2f5b1a179b3bab039b28de7ab1c70cd3dc2a23e8b0a498e407d69ffed2243c8f9b8a4eaef1186ac479ce7e1a32f0833d1838f455730563ca5156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-authres \
python39-authres \
python3dist-authres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
