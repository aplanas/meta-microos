SUMMARY = "Lightweight FreeIPA client"
DESCRIPTION = "python-freeipa is lightweight FreeIPA client."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python311-freeipa-1.0.6-1.8.noarch.rpm"
RPM_HASH = "ad1aa580cf7dbe4c63339a4d7ef09ea83f544a388efa70c2a484b20f7c83cd437f57ff2ffb62a94ce00f3686e631181bea92506e0cdc56fcede57952fb3d86e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-freeipa) \
python311-freeipa \
python3dist(python-freeipa)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
