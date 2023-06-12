SUMMARY = "Java daemon launcher"
DESCRIPTION = "Jsvc is a set of libraries and applications for making Java applications run on \
UNIX more easily. It allows the application (e.g. Tomcat) to perform some \
privileged operations as root (e.g. bind to a port < 1024), and then switch \
identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "apache-commons-daemon-jsvc-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "c8f2d3fc58d30adf98067586970cb3ff89442c1c00a930ebc7670f1d8ececa17d3068324e995b1ffae6e6dc79ad9e7ff8b9f78da2d34089ea99424d6e26a3d15"

RPROVIDES:${PN} += "apache-commons-daemon-jsvc \
apache-commons-daemon-jsvc(aarch-64) \
jakarta-commons-daemon:/usr/sbin/jsvc \
jsvc"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
