SUMMARY = "OCaml library for i18n"
DESCRIPTION = "Ocaml-gettext provides support for internationalization of Ocaml \
programs. \
 \
Constraints : \
 \
* provides a pure Ocaml implementation, \
* the API should be as close as possible to GNU gettext, \
* provides a way to automatically extract translatable \
  strings from Ocaml source code."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.4.2"

RPM_NAME = "ocaml-gettext-0.4.2-3.11.aarch64.rpm"
RPM_HASH = "e3ae72b997375684c43b35d284bb9bfca2ab0d25b10517ee5d16e354a8888d53889815c83711abf5105318a99c11aa4ec62571a1c3160c16092befb3e32a316d"

RPROVIDES:${PN} += "ocaml-gettext \
ocaml-gettext(aarch-64) \
ocaml-gettext-camomile \
ocaml-gettext-stub \
ocaml-gettext-stub-debuginfo \
ocaml-gettext-stub-devel"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
ocaml-camomile-data"

inherit rpm
