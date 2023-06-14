SUMMARY = "MariaDB embedded server development files"
DESCRIPTION = "This package contains the development header files and libraries \
for developing applications that embed the MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "libmariadbd-devel-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "a94650199294bd62f3b7cef969dac96fbc6b399b95ab7f6aeead2ab0cba4e52cea3a77a50328c46d0899c30b6dba44794e68e5f206a44397a2bdc47604af0f94"

RPROVIDES:${PN} += "libmariadbd-devel \
libmysqld-devel"

RDEPENDS:${PN} += "libaio-devel \
libmariadb-devel \
libmariadbd19 \
tcpd-devel"

inherit rpm
