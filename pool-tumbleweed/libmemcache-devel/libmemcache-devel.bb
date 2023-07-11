SUMMARY = "Development files for libmemcache"
DESCRIPTION = "libmemcache implements a client for the superior memcached from Danga \
Interactive. \
 \
This package contains the development files for libmemcache."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.0.rc2"

RPM_NAME = "libmemcache-devel-1.4.0.rc2-152.26.aarch64.rpm"
RPM_HASH = "29a81cb436ed4821dfbd81c8d9c7df9db1da78710c545903c73c66b363c8501752489510f05f85e7417bf22604e9267f0d3760a4bceaa84f31166e90fadd12a4"

RPROVIDES:${PN} += "libmemcache-devel"

RDEPENDS:${PN} += "libmemcache0"

inherit rpm
