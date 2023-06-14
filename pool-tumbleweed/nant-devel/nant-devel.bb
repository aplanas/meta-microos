SUMMARY = "NAnt pkgconfig files"
DESCRIPTION = "This package contains the pkgconfig files for NAnt."
LICENSE = "LGPL-2.1"

PV = "0.92+git20130131"

RPM_NAME = "nant-devel-0.92+git20130131-10.14.noarch.rpm"
RPM_HASH = "650affba397ba11329da6eea1d25ba2b8a4114a6edffa99b62e5871459b54dedcb4b83430931b957406ab8f6ac828faf812b35c760dbf4f887b63b16312ff385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nant-devel \
pkgconfig-nant"

RDEPENDS:${PN} += "nant"

inherit rpm
