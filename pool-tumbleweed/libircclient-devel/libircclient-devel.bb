SUMMARY = "Header files and libraries for compiling against libircclient"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient-devel-1.10-1.15.aarch64.rpm"
RPM_HASH = "2e9badf65016212e9047f0eaaf8eebba33973ec8c472ea0c07bd33098f1825a9276ba148f5c49608983c8c01dc75ba5c5755806e2e8200bb6678f82e913ca1b2"

RPROVIDES:${PN} += "libircclient-devel"

RDEPENDS:${PN} += "libircclient1"

inherit rpm
