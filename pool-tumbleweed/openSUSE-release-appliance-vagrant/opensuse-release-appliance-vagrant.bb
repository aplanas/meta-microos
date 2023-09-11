SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230904-1803.1.aarch64.rpm"
RPM_HASH = "6d0578416b395310e913efa526a389f17f449b169d91d23f61ef318440062b6a9a720a2a40e74d0a0c606ddf4e8b19fa9db1d477533b1c196127c6df1f9a6ec7"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
