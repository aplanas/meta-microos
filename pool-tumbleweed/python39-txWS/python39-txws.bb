SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python39-txWS-0.9.1-4.1.noarch.rpm"
RPM_HASH = "46f9ed1a4ae042206b73e357572367e9ff42e82ea6899e54ae607bb811fedf5d80b69e42ca3c21cc3dccb69ef092b979b47724dc23c0f0115f3fab1098b9baa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txws \
python39-txWS \
python3dist-txws"

RDEPENDS:${PN} += "python-abi \
python39-Twisted"

inherit rpm
