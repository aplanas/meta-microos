SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. It has extensive \
functionality for tensor computer algebra, tensor polynomial \
simplification including multi-term symmetries, fermions and \
anti-commuting variables, Clifford algebras and Fierz transformations, \
implicit coordinate dependence, multiple index types and many more. \
The input format is a subset of TeX. Both a command-line and a \
graphical interface are available. \
 \
Key features of Cadabra2: \
- Input and output using TeX notation. \
- Designed for field-theory problems, with handling of anti-commuting \
  and non-commuting objects without special notations for their \
  products, gamma matrix algebra, Fierz identities, Dirac conjugation, \
  vielbeine, flat and curved, covariant and contravariant indices, \
  implicit dependence of tensors on coordinates, partial and covariant \
  derivatives... \
- Powerful tensor simplification algorithms, not just for mono-term \
  symmetries but also for multi-terms symmetries like the Bianchi \
  identity, or dimensionally-dependent symmetries like the Schouten \
  identity."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.3.2"

RPM_NAME = "cadabra2-2.4.3.2-1.5.aarch64.rpm"
RPM_HASH = "f8d6954bd0688e939bc044d3efef358c2a92de7b8c5870e1c76c2c694e73b8a745af8d142b8bce7299f94db0a2e996748e38adcadd9abfaded90ed1906aad523"

RPROVIDES:${PN} += "cadabra2 \
cadabra2(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpython3.10.so.1.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python3"

inherit rpm
