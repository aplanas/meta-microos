SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python310-freeipa-1.0.6-1.10.noarch.rpm"
RPM_HASH = "a9340c448234f41079cec312a8d23c3afcb049b2600af5a77e3e9c1e8eb2b4a85fc88953ddb13d53077e629421bfddce0846034f3560d10a2abfb0393c814c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-freeipa \
python310-freeipa \
python3dist-python-freeipa"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
