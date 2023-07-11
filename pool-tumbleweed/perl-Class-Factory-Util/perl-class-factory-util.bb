SUMMARY = "Provide utility methods for factory classes"
DESCRIPTION = "This module exports a method that is useful for factory classes."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.7"

RPM_NAME = "perl-Class-Factory-Util-1.7-14.25.noarch.rpm"
RPM_HASH = "f7535cf0e4765fd9d3c185e405c9613000985f1a0e059119f4c80b2f12a0070d8ae051d91a7ec73e295a1114dd64ebc9bfd8f35aa2356f66afa7df4ed4251ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Factory--Util \
perl-Class-Factory-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
