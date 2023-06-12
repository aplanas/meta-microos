SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "0.15.10"

RPM_NAME = "python311-xdoctest-0.15.10-1.11.noarch.rpm"
RPM_HASH = "54803681ba5b141baf992bf48cdbb015b1f9aa5d72bd9a342bcde9c01dec143aa64e4eb33d2c6b58d7193058c3341de530a3c100e98475df39ce6d9f2d1f417a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xdoctest) \
python311-xdoctest \
python3dist(xdoctest)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-six \
update-alternatives"

inherit rpm
