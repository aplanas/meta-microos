SUMMARY = "Development files for google benchmark"
DESCRIPTION = "Development files for google benchmark library"
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "benchmark-devel-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "463fafa481e3bbfe885566ff398b48409c0b7137a14861b8ddf162655bddfe227c5dc6e7a1a4aadb406f3f223d0d82860aa752063586599db7dec9bea9c91853"

RPROVIDES:${PN} += "benchmark-devel benchmark-devel(aarch-64) cmake(benchmark) pkgconfig(benchmark)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbenchmark1"

inherit rpm
