SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python311-mailman3-fedmsg-plugin-0.5-1.13.noarch.rpm"
RPM_HASH = "2e237574a275b678615914f57914226d6f7e6007f3b2c5adf146fb92592604124bb623ca3c7eb2c4f677b414e4311ba1a547f8925bfaf41811c5a4937087408c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mailman3-fedmsg-plugin \
python311-mailman3-fedmsg-plugin \
python3dist-mailman3-fedmsg-plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
