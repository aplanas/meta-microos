SUMMARY = "Stdcompat: compatibility module for OCaml standard library"
DESCRIPTION = "Stdcompat is a compatibility layer allowing programs to use some recent additions to the OCaml standard library while preserving the ability to be compiled on former versions of OCaml."
LICENSE = "BSD-2-Clause"

PV = "20220905"

RPM_NAME = "ocaml-pyml-20220905-1.4.aarch64.rpm"
RPM_HASH = "b23c132519cafc0d5c9548a52a4a3629048a57416627bcdef6460da4288173b76d7961b66abf294544bfd5788c67e0eac345d7b28acacc663c2995156625f866"

RPROVIDES:${PN} += "ocaml-pyml"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
