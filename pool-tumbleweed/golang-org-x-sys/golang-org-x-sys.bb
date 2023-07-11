SUMMARY = "Go packages for low-level interaction with the operating system"
DESCRIPTION = "This repository holds supplemental Go packages for low-level interactions with \
the operating system."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20200420.1957bb5"

RPM_NAME = "golang-org-x-sys-0.0.0+git20200420.1957bb5-1.16.aarch64.rpm"
RPM_HASH = "6624c673ce96a7af79cce341dc1faa9150435b4b35db959c1a5f3425e0666cc9cd12297cddb77b10cc70f2e8d72bf47516bfd91184ef321997690a6499608dcb"

RPROVIDES:${PN} += "golang-org-x-sys"

RDEPENDS:${PN} += ""

inherit rpm
