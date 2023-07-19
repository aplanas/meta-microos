SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-openSUSE-17.89-1.47.aarch64.rpm"
RPM_HASH = "a769dcde42a9cc8f382ef6b06a61f0e88df8fb8fb02cd9b4fc2b567f235de362dbae4c785cea9d964ab912d6d992206841977e595d92cd1bb3ed3f0a9e5cacfc"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
