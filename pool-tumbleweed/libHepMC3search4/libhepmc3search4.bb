SUMMARY = "Shared library for HepMC search"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the shared library for HepMC3 searches."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "libHepMC3search4-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "9c5117a563491ecfacc08eb37ffbd9149a62f07387adb164d401cf452a5fc36f9cf1b818955f9bdf4f287a48c17dfe19a10abfaaaf59f016be75bdf4fcbf9ff9"

RPROVIDES:${PN} += "libHepMC3search.so.4 \
libHepMC3search4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
