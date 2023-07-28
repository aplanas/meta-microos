SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoData94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "e194c4406ce0028eed60d42d04e41f008be0ffac8470735c9cef1a261c4c00d9a3160a1f7690fe26f2c6358ddc6b3a852034b0812d2adc4e3b142114ad5b45c3"

RPROVIDES:${PN} += "libPocoData.so.94 \
libPocoData94 \
poco-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
