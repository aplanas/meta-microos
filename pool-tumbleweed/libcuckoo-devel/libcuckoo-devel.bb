SUMMARY = "Files for Developing with libcuckoo"
DESCRIPTION = "Libcuckoo is a high-performance, concurrent hash table. \
This package contains the libcuckoo development files."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "libcuckoo-devel-0.3.1-1.4.aarch64.rpm"
RPM_HASH = "827a3ea800b73f3c16d21bde9cb3e73c7397cee8ab88ab359c1eaee50763c6effb8a7802937a41f731bfc89fe13bfba9aebcd8f57b4dd7119f67d975b8892dc8"

RPROVIDES:${PN} += "cmake-libcuckoo \
libcuckoo-devel"

RDEPENDS:${PN} += ""

inherit rpm
