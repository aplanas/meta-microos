SUMMARY = "OCaml bindings for Augeas configuration API"
DESCRIPTION = "Augeas is a unified system for editing arbitrary configuration \
files. This provides complete OCaml bindings for Augeas."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "ocaml-augeas-0.6-1.4.aarch64.rpm"
RPM_HASH = "55d127b52ee407d00e2c2bf6832aa7cb0ba8c1b718a774a024e8e90fd7c0478fee7da2cd7a2c108f00989cfe18ca34263f1ed6831a50556968d960dd280481e7"

RPROVIDES:${PN} += "ocaml-augeas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6"

inherit rpm
