SUMMARY = "Development files for ocaml-re"
DESCRIPTION = "The ocaml-re-devel package contains libraries and signature files for \
developing applications that use ocaml-re."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.10.4"

RPM_NAME = "ocaml-re-devel-1.10.4-1.6.aarch64.rpm"
RPM_HASH = "c61a58577ce48df0d41ef9df05837b5a006076c2ca6f90f70974c83699eab045aed33ce9d22aa7d53b4d107a71c6f1b661204cd5746169ea21f83d1b242830c9"

RPROVIDES:${PN} += "ocaml-Re \
ocaml-Re-- \
ocaml-Re--Automata \
ocaml-Re--Category \
ocaml-Re--Color-map \
ocaml-Re--Core \
ocaml-Re--Cset \
ocaml-Re--Emacs \
ocaml-Re--Fmt \
ocaml-Re--Glob \
ocaml-Re--Group \
ocaml-Re--Pcre \
ocaml-Re--Perl \
ocaml-Re--Pmark \
ocaml-Re--Posix \
ocaml-Re--Str \
ocaml-Re-emacs \
ocaml-Re-glob \
ocaml-Re-pcre \
ocaml-Re-perl \
ocaml-Re-posix \
ocaml-Re-str \
ocaml-re-devel \
ocamlfind-re \
ocamlfind-re.emacs \
ocamlfind-re.glob \
ocamlfind-re.pcre \
ocamlfind-re.perl \
ocamlfind-re.posix \
ocamlfind-re.str \
ocamlx-Re \
ocamlx-Re-- \
ocamlx-Re--Automata \
ocamlx-Re--Category \
ocamlx-Re--Color-map \
ocamlx-Re--Core \
ocamlx-Re--Cset \
ocamlx-Re--Emacs \
ocamlx-Re--Fmt \
ocamlx-Re--Glob \
ocamlx-Re--Group \
ocamlx-Re--Pcre \
ocamlx-Re--Perl \
ocamlx-Re--Pmark \
ocamlx-Re--Posix \
ocamlx-Re--Str \
ocamlx-Re-emacs \
ocamlx-Re-glob \
ocamlx-Re-pcre \
ocamlx-Re-perl \
ocamlx-Re-posix \
ocamlx-Re-str"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-re \
ocamlfind-seq \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String"

inherit rpm
