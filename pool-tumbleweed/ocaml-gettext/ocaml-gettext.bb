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

RPM_NAME = "ocaml-gettext-0.4.2-4.1.aarch64.rpm"
RPM_HASH = "615b4bab0d9035a957d6617165c08c62c10412530ec339c275e8ea280e542ef63dae70daffebd03cec584f0428d813fbac4c4f52c3e67e22e837dbbe0cb7318b"

RPROVIDES:${PN} += "ocaml-gettext \
ocaml-gettext-camomile \
ocaml-gettext-stub \
ocaml-gettext-stub-debuginfo \
ocaml-gettext-stub-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
