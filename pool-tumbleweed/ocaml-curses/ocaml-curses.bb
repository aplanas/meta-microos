SUMMARY = "OCaml bindings for ncurses"
DESCRIPTION = "OCaml bindings for ncurses."
LICENSE = "LGPL-2.1+"

PV = "1.0.11"

RPM_NAME = "ocaml-curses-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "2ea1455aa703e2f32291b08ca11f3a50dc93ce686d3ee776abc508025dfd31f2a9ded9341dab797e2d9f795d6ecaa59dd9dfcab753029eaac2d1dfc1718b24e6"

RPROVIDES:${PN} += "ocaml-curses"

RDEPENDS:${PN} += "libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
