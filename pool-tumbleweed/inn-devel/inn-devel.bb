SUMMARY = "InterNetNews development files"
DESCRIPTION = "Rich Salz's InterNetNews news transport system. \
 \
This package contains the files needed to develop software depending on \
inn."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "inn-devel-2.6.5-1.10.aarch64.rpm"
RPM_HASH = "164b4cd8aa8f924731c3fbce925f71356bd07da8de7a158a64d97a001f5969ef31a972e5035ab7afa240f618daf4c6a1b659af16d5f210eea5012b412f7855f8"

RPROVIDES:${PN} += "inn-devel"

RDEPENDS:${PN} += "bison \
gdbm-devel \
inn \
pam-devel \
zlib-devel"

inherit rpm
