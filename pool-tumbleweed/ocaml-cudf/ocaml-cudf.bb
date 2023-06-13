SUMMARY = "Ocaml CUDF library"
DESCRIPTION = "CUDF (for Common Upgradeability Description Format) is a format for describing upgrade scenarios in package-based Free and Open Source Software distribution. This is reference implementation in Ocaml."
LICENSE = "GPL-3.0-only"

PV = "0.9"

RPM_NAME = "ocaml-cudf-0.9-2.15.aarch64.rpm"
RPM_HASH = "5d1eed4ac767aea646dfeab3dd5fa0a5f5e294b9b6be2fe3ce944d96a1d112740f99042e666946376906e7c9c541d7fb9a15eb1b140d50d49db528e70a9b2259"

RPROVIDES:${PN} += "ocaml-cudf \
ocaml-cudf(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
