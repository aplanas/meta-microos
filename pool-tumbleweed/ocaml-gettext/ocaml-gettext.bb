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

RPM_NAME = "ocaml-gettext-0.4.2-3.12.aarch64.rpm"
RPM_HASH = "8e6f0427131f602f1cfeb540993dba960316aae36a9b0bffe1cd9547a440cba0dc75f37acb15440a281248de5cfc732a9b8a6ca8e15c905a290fd00ea6b2b519"

RPROVIDES:${PN} += "ocaml-gettext \
ocaml-gettext-camomile \
ocaml-gettext-stub \
ocaml-gettext-stub-debuginfo \
ocaml-gettext-stub-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocaml-camomile-data"

inherit rpm
