SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-info-7.5.0+r278197-14.6.noarch.rpm"
RPM_HASH = "c896f80a9d761577aa129bcc812d4ee00cc52055a7bb11a18d6a9e4fe4b2c5f4f2352f62ac6e427e94c91c4a5270dd73e63cf362422e46646b54e5e13d42438b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc7-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
