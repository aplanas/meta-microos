SUMMARY = "Libraries and header files for ChaSen developers"
DESCRIPTION = "Libraries and header files for ChaSen developers."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-devel-2.4.5-2.12.aarch64.rpm"
RPM_HASH = "1aada02eaadabe7c4d83f37804c8f5df1b68969fce396963cbcae71d277c59812c3f3bc3bc48d11bb3b5dc00704939ed269a3c9aa95221a2d63827e4de3f72ca"

RPROVIDES:${PN} += "chasen-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
chasen"

inherit rpm
