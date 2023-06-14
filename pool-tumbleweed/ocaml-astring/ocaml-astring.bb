SUMMARY = "Alternative String module for OCaml"
DESCRIPTION = "Astring exposes an alternative String module for OCaml. This module tries to balance minimality and expressiveness for basic, index-free, string processing and provides types and functions for substrings, string sets and string maps. \
 \
Remaining compatible with the OCaml String module is a non-goal. The String module exposed by Astring has exception safe functions, removes deprecated and rarely used functions, alters some signatures and names, adds a few missing functions and fully exploits OCaml's newfound string immutability."
LICENSE = "ISC"

PV = "0.8.5"

RPM_NAME = "ocaml-astring-0.8.5-1.15.aarch64.rpm"
RPM_HASH = "684476cd601c72c178235cba1efa419e1fb81426c566863add8672bed58ee970a8da51ce0a9540fc610ee2ab6fd17c9586002e173db166da10361e43e5d8006d"

RPROVIDES:${PN} += "ocaml-astring"

RDEPENDS:${PN} += ""

inherit rpm
