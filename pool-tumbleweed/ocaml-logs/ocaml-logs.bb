SUMMARY = "Logging infrastructure for OCaml"
DESCRIPTION = "Logs provides a logging infrastructure for OCaml. Logging is performed on sources whose reporting level can be set independently. Log message report is decoupled from logging and is handled by a reporter. \
 \
A few optional log reporters are distributed with the base library and the API easily allows to implement your own."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-logs-0.7.0-3.6.aarch64.rpm"
RPM_HASH = "d7554f690c5af7bcfbf881d759bf35a07a0d668c34db5ed9ac198a9b007363f4d96f6efc8725dfac38b13befaf4c0312e60ac6ed742bf0506cc5a03b251ee969"

RPROVIDES:${PN} += "ocaml-logs"

RDEPENDS:${PN} += ""

inherit rpm
