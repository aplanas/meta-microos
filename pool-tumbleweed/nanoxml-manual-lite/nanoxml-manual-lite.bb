SUMMARY = "Manual for the lite version of nanoxml"
DESCRIPTION = "Documentation for the lite version of nanoxml."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-manual-lite-2.2.3-4.7.noarch.rpm"
RPM_HASH = "e99d60961208c7af2af9782654aaef6cd9fcdc84a765de32c707c0fb2cdc010f3528d5a1afc1d5d8888b42270feeaf5c915fa1cf0c9157e185a8d26c24701b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-manual-lite"

RDEPENDS:${PN} += ""

inherit rpm
