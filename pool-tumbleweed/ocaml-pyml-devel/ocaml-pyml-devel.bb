SUMMARY = "Development files for ocaml-pyml"
DESCRIPTION = "The ocaml-pyml-devel package contains libraries and signature files for \
developing applications that use ocaml-pyml."
LICENSE = "BSD-2-Clause"

PV = "20220905"

RPM_NAME = "ocaml-pyml-devel-20220905-1.4.aarch64.rpm"
RPM_HASH = "0f456bf82331eff24733d2b13488b01f6204e6f8661b3a0b178f829f72a2c26a0bd416f3bd132741a16e63f1d8b52b7b5fcbeab43a5a857f4f1657de40a194c1"

RPROVIDES:${PN} += "ocaml-Numpy \
ocaml-Py \
ocaml-Pycaml \
ocaml-Pyml-arch \
ocaml-Pyops \
ocaml-Pytypes \
ocaml-Pyutils \
ocaml-Pywrappers \
ocaml-pyml-devel \
ocamlfind-pyml \
ocamlx-Numpy \
ocamlx-Py \
ocamlx-Pycaml \
ocamlx-Pyml-arch \
ocamlx-Pyops \
ocamlx-Pytypes \
ocamlx-Pyutils \
ocamlx-Pywrappers"

RDEPENDS:${PN} += "libc.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-CamlinternalOO \
ocaml-Stdcompat \
ocaml-Stdcompat--arg-s \
ocaml-Stdcompat--array-s \
ocaml-Stdcompat--arrayLabels-s \
ocaml-Stdcompat--atomic-s \
ocaml-Stdcompat--bool-s \
ocaml-Stdcompat--buffer-s \
ocaml-Stdcompat--bytes-s \
ocaml-Stdcompat--bytesLabels-s \
ocaml-Stdcompat--char-s \
ocaml-Stdcompat--digest-s \
ocaml-Stdcompat--either-s \
ocaml-Stdcompat--ephemeron-s \
ocaml-Stdcompat--filename-s \
ocaml-Stdcompat--float-s \
ocaml-Stdcompat--format-s \
ocaml-Stdcompat--fun-s \
ocaml-Stdcompat--hashtbl \
ocaml-Stdcompat--hashtbl-ext \
ocaml-Stdcompat--hashtbl-s \
ocaml-Stdcompat--in-channel-s \
ocaml-Stdcompat--init \
ocaml-Stdcompat--int-s \
ocaml-Stdcompat--int32-s \
ocaml-Stdcompat--int64-s \
ocaml-Stdcompat--lazy-s \
ocaml-Stdcompat--lexing-s \
ocaml-Stdcompat--list-s \
ocaml-Stdcompat--listLabels-s \
ocaml-Stdcompat--map-s \
ocaml-Stdcompat--nativeint-s \
ocaml-Stdcompat--option-s \
ocaml-Stdcompat--out-channel-s \
ocaml-Stdcompat--pervasives-s \
ocaml-Stdcompat--printexc-s \
ocaml-Stdcompat--printf-s \
ocaml-Stdcompat--queue-s \
ocaml-Stdcompat--random-s \
ocaml-Stdcompat--result-s \
ocaml-Stdcompat--seq \
ocaml-Stdcompat--seq-s \
ocaml-Stdcompat--set-s \
ocaml-Stdcompat--stack-s \
ocaml-Stdcompat--stdlib-s \
ocaml-Stdcompat--string-s \
ocaml-Stdcompat--stringLabels-s \
ocaml-Stdcompat--sys-s \
ocaml-Stdcompat--uchar-s \
ocaml-Stdcompat--unit-s \
ocaml-Stdcompat--weak-s \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--ArrayLabels \
ocaml-Stdlib--Atomic \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Float \
ocaml-Stdlib--Format \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--In-channel \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Oo \
ocaml-Stdlib--Out-channel \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Random \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--Stack \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Weak \
ocaml-Unix \
ocaml-pyml \
ocamlfind-bigarray \
ocamlfind-stdcompat \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Stdcompat \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bigarray \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Unix \
which"

inherit rpm
