SUMMARY = "A light openSUSE theme modified to suite the openSUSE 13.2 artwork"
DESCRIPTION = "Ice is a light theme for enlightenment, this version has been modified to suite the artwork for openSUSE 13.2"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-ice-20220219.1.26-1.10.noarch.rpm"
RPM_HASH = "15bb45889c3b7668ea30556e4e2ff12ccc21335eb5b0619812ccefa3aa22a6df43f4ff37868a97705acb00a4fc88b2da3aebb3d9387453e7fabb91c77c973c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-openSUSE-ice"

RDEPENDS:${PN} += ""

inherit rpm
