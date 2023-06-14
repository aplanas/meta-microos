SUMMARY = "Go packages for low-level interaction with the operating system"
DESCRIPTION = "This repository holds supplemental Go packages for low-level interactions with \
the operating system."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20200420.1957bb5"

RPM_NAME = "golang-org-x-sys-0.0.0+git20200420.1957bb5-1.15.aarch64.rpm"
RPM_HASH = "4810e060b73bd412f974d0d1f626c099bc813f36fc06a7af41bbd4f4ddd29f37e77614edd5a70db92f32b0908c5a08f893b9e0c8a721c6a19d533498bc779c25"

RPROVIDES:${PN} += "golang-org-x-sys"

RDEPENDS:${PN} += ""

inherit rpm
