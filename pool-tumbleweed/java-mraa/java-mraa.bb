SUMMARY = "Java bindings for mraa"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime, you can create portable code that will work \
across the supported platforms. \
 \
This package contains java bindings for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "java-mraa-2.2.0-2.11.aarch64.rpm"
RPM_HASH = "b01fe568901025421bbc20594fec318a48931585cb70b1ae623509b011f341210878b844d7350af1930cacf13f54965bff5feec6640636bfc3b656230d4428e1"

RPROVIDES:${PN} += "java-mraa \
libmraajava.so \
pkgconfig-mraajava"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
javapackages-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmraa.so.2 \
libmraa2 \
libstdc++.so.6"

inherit rpm
