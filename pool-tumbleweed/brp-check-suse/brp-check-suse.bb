SUMMARY = "Build root policy check scripts"
DESCRIPTION = "This package contains all suse scripts called in the \
build root checking or in parts implementing SUSE policies."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230324.8680ce4"

RPM_NAME = "brp-check-suse-84.87+git20230324.8680ce4-1.1.aarch64.rpm"
RPM_HASH = "0252b1ad0c281944ce5593b94be0ccbb90712f28904adb03da4d3a3a12a6bba33a4586097de8aa5cae263a7d35b7166574d7b2b041b0b5c2d292cb49cfadadbd"

RPROVIDES:${PN} += "brp-check-suse"

RDEPENDS:${PN} += "perl"

inherit rpm
