SUMMARY = "Documentation for Vagrant"
DESCRIPTION = "This package contains the documentation for vagrant."
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "vagrant-doc-2.3.7-1.1.noarch.rpm"
RPM_HASH = "8fb4e07c114210334978af518b110e76271c8e16d406dfcce54bcf2a850876f265196559e422a5f08bf3cf8828dac5d6ccb00eb343560a55cfbeaca889e2c9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-doc"

RDEPENDS:${PN} += ""

inherit rpm
