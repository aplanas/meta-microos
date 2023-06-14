SUMMARY = "Development files for ocaml-fileutils"
DESCRIPTION = "The ocaml-fileutils-devel package contains libraries and signature files for \
developing applications that use ocaml-fileutils."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.6.4"

RPM_NAME = "ocaml-fileutils-devel-0.6.4-1.3.aarch64.rpm"
RPM_HASH = "1671f112680d4bfdae26ad1d3b4627069bdabff244faf3a02585dc64bb94a82d36aa4189a67ef0ecc090166f51a7f31d713010599cd5075bd56447d21a9412f1"

RPROVIDES:${PN} += "ocaml-CommonPath \
ocaml-ExtensionPath \
ocaml-FilePath \
ocaml-FilePath-type \
ocaml-FileStringExt \
ocaml-FileUtil \
ocaml-FileUtilCHMOD \
ocaml-FileUtilCMP \
ocaml-FileUtilCP \
ocaml-FileUtilDU \
ocaml-FileUtilFIND \
ocaml-FileUtilLS \
ocaml-FileUtilMKDIR \
ocaml-FileUtilMV \
ocaml-FileUtilMisc \
ocaml-FileUtilMode \
ocaml-FileUtilPWD \
ocaml-FileUtilPermission \
ocaml-FileUtilREADLINK \
ocaml-FileUtilRM \
ocaml-FileUtilSTAT \
ocaml-FileUtilSize \
ocaml-FileUtilStr \
ocaml-FileUtilTEST \
ocaml-FileUtilTOUCH \
ocaml-FileUtilTypes \
ocaml-FileUtilUMASK \
ocaml-FileUtilWHICH \
ocaml-UnixPath \
ocaml-Win32Path \
ocaml-fileutils-devel \
ocamlfind-fileutils \
ocamlfind-fileutils.str \
ocamlx-CommonPath \
ocamlx-ExtensionPath \
ocamlx-FilePath \
ocamlx-FilePath-type \
ocamlx-FileStringExt \
ocamlx-FileUtil \
ocamlx-FileUtilCHMOD \
ocamlx-FileUtilCMP \
ocamlx-FileUtilCP \
ocamlx-FileUtilDU \
ocamlx-FileUtilFIND \
ocamlx-FileUtilLS \
ocamlx-FileUtilMKDIR \
ocamlx-FileUtilMV \
ocamlx-FileUtilMisc \
ocamlx-FileUtilMode \
ocamlx-FileUtilPWD \
ocamlx-FileUtilPermission \
ocamlx-FileUtilREADLINK \
ocamlx-FileUtilRM \
ocamlx-FileUtilSTAT \
ocamlx-FileUtilSize \
ocamlx-FileUtilStr \
ocamlx-FileUtilTEST \
ocamlx-FileUtilTOUCH \
ocamlx-FileUtilTypes \
ocamlx-FileUtilUMASK \
ocamlx-FileUtilWHICH \
ocamlx-UnixPath \
ocamlx-Win32Path"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Str \
ocaml-Unix \
ocaml-fileutils \
ocamlfind-seq \
ocamlfind-stdlib-shims \
ocamlfind-str \
ocamlfind-unix \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Str \
ocamlx-Unix"

inherit rpm
