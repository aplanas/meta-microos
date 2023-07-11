SUMMARY = "File paths for OCaml"
DESCRIPTION = "Fpath is an OCaml module for handling file system paths with POSIX or Windows conventions. Fpath processes paths without accessing the file system and is independent from any system library."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "ocaml-fpath-0.7.3-2.10.aarch64.rpm"
RPM_HASH = "73545623701ac4f0f775f6f21e48cf0b32db41c88915fbddcd6266e4adfd625426401edcc70b995afc5ef83a1fa3e58154a44cc0475d2b96b71b3009c1afdac3"

RPROVIDES:${PN} += "ocaml-fpath"

RDEPENDS:${PN} += ""

inherit rpm
