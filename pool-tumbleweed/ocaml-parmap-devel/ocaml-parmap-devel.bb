SUMMARY = "Development files for ocaml-parmap"
DESCRIPTION = "The ocaml-parmap-devel package contains libraries and signature files for \
developing applications that use ocaml-parmap."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-devel-1.2.5-1.4.aarch64.rpm"
RPM_HASH = "e1a712e3631a5cdfc4dbb6d084e9a1b3a774710c75df0c02bea274aed82eb08f293246879cfe250bfe76508a92eee8238b79b410378571ca7d268467099156c3"

RPROVIDES:${PN} += "ocaml(Bytearray) \
ocaml(Parmap) \
ocaml(Parmap_compat) \
ocaml(Parmap_utils) \
ocaml(Setcore) \
ocaml-parmap-devel \
ocaml-parmap-devel(aarch-64) \
ocamlfind(parmap) \
ocamlx(Bytearray) \
ocamlx(Parmap) \
ocamlx(Parmap_compat) \
ocamlx(Parmap_utils) \
ocamlx(Setcore)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Gc) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Marshal) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Unix) \
ocaml-parmap \
ocamlfind(bigarray) \
ocamlfind(unix) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bigarray) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Gc) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Marshal) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Sys) \
ocamlx(Unix)"

inherit rpm
