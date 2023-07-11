SUMMARY = "OCaml binding for libvirt"
DESCRIPTION = "OCaml binding for libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.6.1.7"

RPM_NAME = "ocaml-libvirt-0.6.1.7-1.4.aarch64.rpm"
RPM_HASH = "94bf462eef44c5b18f62620ee922e12d616667571c1b0b1ca249f964a23a4b8ec9794634b7db9216cda24027da8d4c6e42c82336114601f9c92b6808b2c6afe1"

RPROVIDES:${PN} += "ocaml-libvirt"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libvirt.so.0"

inherit rpm
