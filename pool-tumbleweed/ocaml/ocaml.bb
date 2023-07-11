SUMMARY = "OCaml Compiler and Programming Environment"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package comprises two batch compilers (a fast bytecode compiler \
and an optimizing native-code compiler), an interactive top level \
system, Lex&Yacc tools, a replay debugger, and a comprehensive library."
LICENSE = "QPL-1.0 & SUSE-LGPL-2.0-with-linking-exception"

PV = "4.14.1"

RPM_NAME = "ocaml-4.14.1-1.4.aarch64.rpm"
RPM_HASH = "3acbed33ed0154085795e508401864c922480e3acc6d1e7bc8f738781f0b53de60e6047a3dc80f808a2ab7484816d1590b1a54da049fd64c6609c01552a53310"

RPROVIDES:${PN} += "libasmrun-shared.so \
libcamlrun-shared.so \
ocaml \
ocaml-Bigarray \
ocaml-CamlinternalAtomic \
ocaml-CamlinternalFormat \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalMod \
ocaml-CamlinternalOO \
ocaml-Condition \
ocaml-Dynlink \
ocaml-Dynlink-common \
ocaml-Dynlink-compilerlibs \
ocaml-Dynlink-platform-intf \
ocaml-Dynlink-types \
ocaml-Event \
ocaml-Mutex \
ocaml-Profiling \
ocaml-Semaphore \
ocaml-Std-exit \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--ArrayLabels \
ocaml-Stdlib--Atomic \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Bool \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--BytesLabels \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Either \
ocaml-Stdlib--Ephemeron \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Float \
ocaml-Stdlib--Format \
ocaml-Stdlib--Fun \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Genlex \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--In-channel \
ocaml-Stdlib--Int \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Map \
ocaml-Stdlib--Marshal \
ocaml-Stdlib--MoreLabels \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Oo \
ocaml-Stdlib--Option \
ocaml-Stdlib--Out-channel \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Pervasives \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Random \
ocaml-Stdlib--Result \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--StdLabels \
ocaml-Stdlib--Stream \
ocaml-Stdlib--String \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Unit \
ocaml-Stdlib--Weak \
ocaml-Str \
ocaml-Thread \
ocaml-ThreadUnix \
ocaml-Unix \
ocaml-UnixLabels \
ocaml-compiler \
ocaml-ocaml-base-version \
ocaml-ocaml.opt \
ocaml-seq \
ocaml-seq-debuginfo \
ocaml-seq-devel \
ocamlfind-bigarray \
ocamlfind-bytes \
ocamlfind-dynlink \
ocamlfind-raw-spacetime \
ocamlfind-seq \
ocamlfind-stdlib \
ocamlfind-str \
ocamlfind-threads \
ocamlfind-threads.none \
ocamlfind-threads.posix \
ocamlfind-threads.vm \
ocamlfind-uchar \
ocamlfind-unix \
ocamlx-Bigarray \
ocamlx-CamlinternalAtomic \
ocamlx-CamlinternalFormat \
ocamlx-CamlinternalFormatBasics \
ocamlx-CamlinternalLazy \
ocamlx-CamlinternalMod \
ocamlx-CamlinternalOO \
ocamlx-Condition \
ocamlx-Dynlink \
ocamlx-Dynlink-common \
ocamlx-Dynlink-compilerlibs \
ocamlx-Dynlink-platform-intf \
ocamlx-Dynlink-types \
ocamlx-Event \
ocamlx-Mutex \
ocamlx-Profiling \
ocamlx-Semaphore \
ocamlx-Std-exit \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--ArrayLabels \
ocamlx-Stdlib--Atomic \
ocamlx-Stdlib--Bigarray \
ocamlx-Stdlib--Bool \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--BytesLabels \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Complex \
ocamlx-Stdlib--Digest \
ocamlx-Stdlib--Either \
ocamlx-Stdlib--Ephemeron \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Float \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Fun \
ocamlx-Stdlib--Gc \
ocamlx-Stdlib--Genlex \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--In-channel \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lazy \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Marshal \
ocamlx-Stdlib--MoreLabels \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Obj \
ocamlx-Stdlib--Oo \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Out-channel \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Pervasives \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--Result \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--Stack \
ocamlx-Stdlib--StdLabels \
ocamlx-Stdlib--Stream \
ocamlx-Stdlib--String \
ocamlx-Stdlib--StringLabels \
ocamlx-Stdlib--Sys \
ocamlx-Stdlib--Uchar \
ocamlx-Stdlib--Unit \
ocamlx-Stdlib--Weak \
ocamlx-Str \
ocamlx-Thread \
ocamlx-ThreadUnix \
ocamlx-Unix \
ocamlx-UnixLabels"

RDEPENDS:${PN} += "/usr/bin/ocamlrun \
gcc13 \
libc.so.6 \
libm.so.6 \
ncurses-devel \
ocaml-runtime"

inherit rpm
