SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python39-freeipa-1.0.6-1.10.noarch.rpm"
RPM_HASH = "1dfaa02031de2bd3f6f976502c3e78c3767db792043b7ba199c38456cb48290a4691ef931c79cbbb1df7ca0941ccb7bd564103701065ac82b16d197e58eebd40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-freeipa \
python39-freeipa \
python3dist-python-freeipa"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
