SUMMARY = "Development files for ocaml-libvirt"
DESCRIPTION = "The ocaml-libvirt-devel package contains libraries and signature files for \
developing applications that use ocaml-libvirt."
LICENSE = "LGPL-2.0-or-later"

PV = "0.6.1.7"

RPM_NAME = "ocaml-libvirt-devel-0.6.1.7-1.4.aarch64.rpm"
RPM_HASH = "b99c80d86620e3115d578fc884a413d2fa41e89e605bff80bc23a54474558705df3c52ce43c1962efff0fb6acf5048a0e7bf0e27c2adcae7c973d86b5ca6d927"

RPROVIDES:${PN} += "ocaml-Libvirt \
ocaml-Libvirt-version \
ocaml-libvirt-devel \
ocamlfind-libvirt \
ocamlx-Libvirt \
ocamlx-Libvirt-version"

RDEPENDS:${PN} += "libc.so.6 \
libvirt.so.0 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-libvirt \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
pkgconfig-libvirt"

inherit rpm
