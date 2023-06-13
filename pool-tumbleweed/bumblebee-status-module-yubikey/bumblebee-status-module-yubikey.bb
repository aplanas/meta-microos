SUMMARY = "Shows yubikey information"
DESCRIPTION = "The output indicates that a YubiKey is not connected or it displays \
the corresponding serial number."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-yubikey-2.1.5-3.3.noarch.rpm"
RPM_HASH = "5227933558aa111a56eee215a1f7d7626ba366a8b1de1c07c74008691b67832a3afb5d3a0057829ee686a0c58331f94cd3c46b05d6fd5c4153cf59dfd24f4b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-yubikey"

RDEPENDS:${PN} += "bumblebee-status \
python3-python-yubico"

inherit rpm
