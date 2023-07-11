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

RPM_NAME = "cadabra2-2.4.3.2-1.6.aarch64.rpm"
RPM_HASH = "cf843c75880e997b36380eb79406e86daa33641278d3515843b9e67500b8d3f37c48b6b4d7b350f326689c07390f2a9b1ab6f25120df79a95e35cadcaff4f0d4"

RPROVIDES:${PN} += "cadabra2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libpython3.11.so.1.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
python-abi \
python3"

inherit rpm
