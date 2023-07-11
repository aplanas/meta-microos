SUMMARY = "The OCaml graphics library"
DESCRIPTION = "The graphics library provides a set of portable drawing \
primitives. Drawing takes place in a separate window that is created \
when Graphics.open_graph is called. \
 \
This library used to be distributed with OCaml up to OCaml 4.08."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "5.1.2"

RPM_NAME = "ocaml-graphics-5.1.2-2.9.aarch64.rpm"
RPM_HASH = "36a6df6a91b0484422f135dfb4d2f6f7301f65475b273b8780e38d9d6f0100ca6870e5e0643b2d4946ed0c07d31851f8c20f8dc3bf83c2e4f630960851f86e3a"

RPROVIDES:${PN} += "ocaml-graphics"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6"

inherit rpm
