SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-vagrant-20230707-1726.1.aarch64.rpm"
RPM_HASH = "9917cce6ed4a6e9dfe7fc056b221dbb4565882f3cb7557bf12d0e45f121db8d1f99d320699103b8380c77e11a7a1084aaf6911eb54f571909ed7f7c74a41d1f8"

RPROVIDES:${PN} += "flavor-appliance-vagrant \
openSUSE-release-appliance-vagrant \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
