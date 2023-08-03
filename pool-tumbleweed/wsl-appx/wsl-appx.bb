SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.639.aarch64.rpm"
RPM_HASH = "949a865eb1a2cf8446caf75187af09b54e4a91fe1f01b6a72f227778899a74bfd8749ef542db87e202fff95783e0300eead3100cccca273413615d2b984295a7"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
