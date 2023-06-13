SUMMARY = "OCaml binding for libvirt"
DESCRIPTION = "OCaml binding for libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.6.1.7"

RPM_NAME = "ocaml-libvirt-0.6.1.7-1.3.aarch64.rpm"
RPM_HASH = "74cb1a30337e9e7a8e50a7c53ed4caaf5e0a7e299e363b6db3a64d3bd9b0ad8478ffe982a18bdc2fdd5fce6f3b85e0d4ba1d52a5df4b30d83019128b43b6bfa1"

RPROVIDES:${PN} += "ocaml-libvirt \
ocaml-libvirt(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit) \
libvirt.so.0()(64bit)"

inherit rpm
