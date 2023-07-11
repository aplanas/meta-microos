SUMMARY = "Alternative String module for OCaml"
DESCRIPTION = "Astring exposes an alternative String module for OCaml. This module tries to balance minimality and expressiveness for basic, index-free, string processing and provides types and functions for substrings, string sets and string maps. \
 \
Remaining compatible with the OCaml String module is a non-goal. The String module exposed by Astring has exception safe functions, removes deprecated and rarely used functions, alters some signatures and names, adds a few missing functions and fully exploits OCaml's newfound string immutability."
LICENSE = "ISC"

PV = "0.8.5"

RPM_NAME = "ocaml-astring-0.8.5-1.16.aarch64.rpm"
RPM_HASH = "b894a76aa11481336252db2bf3bad49c6ce291c281780882c7607951828f52ce279bf9fe251b1b41c30d035dc38e2f668dede72e86665794f8b401722757880f"

RPROVIDES:${PN} += "ocaml-astring"

RDEPENDS:${PN} += ""

inherit rpm
