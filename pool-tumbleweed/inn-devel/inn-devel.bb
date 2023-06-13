SUMMARY = "InterNetNews development files"
DESCRIPTION = "Rich Salz's InterNetNews news transport system. \
 \
This package contains the files needed to develop software depending on \
inn."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-devel-2.6.5-1.6.aarch64.rpm"
RPM_HASH = "69e322eb223d22a10b8872919505d0a617f9341cf27d156a6683884368db7fa0c46680fe2ef28bc8c1c8b6e0a8ba5c4558939c6a45f43d1e6115bdd80717e4bf"

RPROVIDES:${PN} += "inn-devel \
inn-devel(aarch-64)"

RDEPENDS:${PN} += "bison \
gdbm-devel \
inn \
pam-devel \
zlib-devel"

inherit rpm
