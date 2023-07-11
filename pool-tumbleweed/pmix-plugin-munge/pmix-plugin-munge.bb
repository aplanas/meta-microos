SUMMARY = "PMI-X munge plugin version 1"
DESCRIPTION = "This package contains the munge plugin for libpmix2."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "pmix-plugin-munge-3.2.3-10.2.aarch64.rpm"
RPM_HASH = "9b319774f25796bf258e4a3e9554e835b1b10bc447f9511e8f15e71985b2c980f062a2286661adba8664cfa213a801897c9da69acec60419bcd5a809d5e3243f"

RPROVIDES:${PN} += "pmix-plugin-munge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmca-common-dstore1 \
libmunge.so.2 \
libpmix.so.2"

inherit rpm
