SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-appliance-kvm-20230801-1756.1.aarch64.rpm"
RPM_HASH = "9bb1c610b7742f00c7bbca631aaf0bf59829861b290136756387e4117e0d739fecb78387484b22da4a472e4f474ab94c846412b35c4bd9f2b38b962a62737afe"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
