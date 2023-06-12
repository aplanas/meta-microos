SUMMARY = "RPM macros for building OCaml source packages"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains a set of helper macros to unify common code used \
in ocaml spec files."
LICENSE = "GPL-2.0-only"

PV = "20230101"

RPM_NAME = "ocaml-rpm-macros-20230101-2.1.aarch64.rpm"
RPM_HASH = "08bc6bf0eba202903668a880a62d9fcd0b213d5fdb0396097c9acfed1d4abd048fc00b9f7db20311ac24afb781c5502508d571decb5bc70eceb32f72b33b9974"

RPROVIDES:${PN} += "ocaml-rpm-macros \
ocaml-rpm-macros(aarch-64) \
rpm_macro(_find_debuginfo_dwz_opts) \
rpm_macro(_oasis_docdir_base) \
rpm_macro(_oasis_docdir_dvi) \
rpm_macro(_oasis_docdir_html) \
rpm_macro(_oasis_docdir_pdf) \
rpm_macro(_oasis_docdir_ps) \
rpm_macro(oasis_docdir) \
rpm_macro(oasis_docdir_dvi) \
rpm_macro(oasis_docdir_html) \
rpm_macro(oasis_docdir_pdf) \
rpm_macro(oasis_docdir_ps) \
rpm_macro(oasis_setup) \
rpm_macro(ocaml_create_file_list) \
rpm_macro(ocaml_dune_build) \
rpm_macro(ocaml_dune_install) \
rpm_macro(ocaml_dune_setup) \
rpm_macro(ocaml_dune_test) \
rpm_macro(ocaml_native_compiler) \
rpm_macro(ocaml_oasis_build) \
rpm_macro(ocaml_oasis_configure) \
rpm_macro(ocaml_oasis_doc) \
rpm_macro(ocaml_oasis_findlib_install) \
rpm_macro(ocaml_oasis_install) \
rpm_macro(ocaml_oasis_test) \
rpm_macro(ocaml_preserve_bytecode) \
rpm_macro(ocaml_standard_library) \
rpm_macro(suse_ocaml_native_compiler)"
RDEPENDS:${PN} += ""

inherit rpm
