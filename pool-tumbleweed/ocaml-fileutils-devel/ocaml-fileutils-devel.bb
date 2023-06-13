SUMMARY = "Development files for ocaml-fileutils"
DESCRIPTION = "The ocaml-fileutils-devel package contains libraries and signature files for \
developing applications that use ocaml-fileutils."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.6.4"

RPM_NAME = "ocaml-fileutils-devel-0.6.4-1.3.aarch64.rpm"
RPM_HASH = "1671f112680d4bfdae26ad1d3b4627069bdabff244faf3a02585dc64bb94a82d36aa4189a67ef0ecc090166f51a7f31d713010599cd5075bd56447d21a9412f1"

RPROVIDES:${PN} += "ocaml(CommonPath) \
ocaml(ExtensionPath) \
ocaml(FilePath) \
ocaml(FilePath_type) \
ocaml(FileStringExt) \
ocaml(FileUtil) \
ocaml(FileUtilCHMOD) \
ocaml(FileUtilCMP) \
ocaml(FileUtilCP) \
ocaml(FileUtilDU) \
ocaml(FileUtilFIND) \
ocaml(FileUtilLS) \
ocaml(FileUtilMKDIR) \
ocaml(FileUtilMV) \
ocaml(FileUtilMisc) \
ocaml(FileUtilMode) \
ocaml(FileUtilPWD) \
ocaml(FileUtilPermission) \
ocaml(FileUtilREADLINK) \
ocaml(FileUtilRM) \
ocaml(FileUtilSTAT) \
ocaml(FileUtilSize) \
ocaml(FileUtilStr) \
ocaml(FileUtilTEST) \
ocaml(FileUtilTOUCH) \
ocaml(FileUtilTypes) \
ocaml(FileUtilUMASK) \
ocaml(FileUtilWHICH) \
ocaml(UnixPath) \
ocaml(Win32Path) \
ocaml-fileutils-devel \
ocaml-fileutils-devel(aarch-64) \
ocamlfind(fileutils) \
ocamlfind(fileutils.str) \
ocamlx(CommonPath) \
ocamlx(ExtensionPath) \
ocamlx(FilePath) \
ocamlx(FilePath_type) \
ocamlx(FileStringExt) \
ocamlx(FileUtil) \
ocamlx(FileUtilCHMOD) \
ocamlx(FileUtilCMP) \
ocamlx(FileUtilCP) \
ocamlx(FileUtilDU) \
ocamlx(FileUtilFIND) \
ocamlx(FileUtilLS) \
ocamlx(FileUtilMKDIR) \
ocamlx(FileUtilMV) \
ocamlx(FileUtilMisc) \
ocamlx(FileUtilMode) \
ocamlx(FileUtilPWD) \
ocamlx(FileUtilPermission) \
ocamlx(FileUtilREADLINK) \
ocamlx(FileUtilRM) \
ocamlx(FileUtilSTAT) \
ocamlx(FileUtilSize) \
ocamlx(FileUtilStr) \
ocamlx(FileUtilTEST) \
ocamlx(FileUtilTOUCH) \
ocamlx(FileUtilTypes) \
ocamlx(FileUtilUMASK) \
ocamlx(FileUtilWHICH) \
ocamlx(UnixPath) \
ocamlx(Win32Path)"

RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Str) \
ocaml(Unix) \
ocaml-fileutils \
ocamlfind(seq) \
ocamlfind(stdlib-shims) \
ocamlfind(str) \
ocamlfind(unix) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Str) \
ocamlx(Unix)"

inherit rpm
