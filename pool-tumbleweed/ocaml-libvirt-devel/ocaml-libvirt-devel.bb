SUMMARY = "Development files for ocaml-libvirt"
DESCRIPTION = "The ocaml-libvirt-devel package contains libraries and signature files for \
developing applications that use ocaml-libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.6.1.7"

RPM_NAME = "ocaml-libvirt-devel-0.6.1.7-1.3.aarch64.rpm"
RPM_HASH = "1dcbf73739110ebb63c56f237cafd15267a0591d020168a0236dcd78a6294d2a1d046a935cca36df325942ae5238e9e6d42582f2b4b838ec06dafb11109973ef"

RPROVIDES:${PN} += "ocaml(Libvirt) \
ocaml(Libvirt_version) \
ocaml-libvirt-devel \
ocaml-libvirt-devel(aarch-64) \
ocamlfind(libvirt) \
ocamlx(Libvirt) \
ocamlx(Libvirt_version)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libvirt.so.0()(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Uchar) \
ocaml-libvirt \
ocamlfind(unix) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Callback) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__String) \
pkgconfig(libvirt)"

inherit rpm
