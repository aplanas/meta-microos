SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Caja file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "owncloud-client-caja-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "5d9bb1bedbd18dcde0f896b59c2f6977d96ea201ea47e583b4f235f08317740126d8e202f7e8aca0d4e27c4cc8ece6867589b090812b9f938912aba2a8fac949"

RPROVIDES:${PN} += "owncloud-client-caja"

RDEPENDS:${PN} += "nemo \
owncloud-client \
python-caja"

inherit rpm
