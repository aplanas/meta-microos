SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-MicroOS-17.89-1.31.aarch64.rpm"
RPM_HASH = "51fb683479fa5cb1f9f06463e7acc2e78a2a2c00529726f8e3f28331a6a6ecae260dbec756815a3ae2df1b909ba2898f54f7c238d3129b8daa5b72822b5d882d"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
