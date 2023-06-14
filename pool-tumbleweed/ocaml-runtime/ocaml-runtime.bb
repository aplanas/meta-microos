SUMMARY = "OCaml runtime environment"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains the runtime environment needed to run OCaml \
bytecode."
LICENSE = "QPL-1.0"

PV = "4.14.1"

RPM_NAME = "ocaml-runtime-4.14.1-1.3.aarch64.rpm"
RPM_HASH = "289f4da27c5dacc46a9c18fe43e3f3449c1955aa57f90c9de138f741f091af96281bcd85f8a1c30707b68c88b5ce68c836fcefb5dc08869c7ea192cd0fbe703f"

RPROVIDES:${PN} += "ocaml-Bigarray \
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
ocaml-runtime"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
