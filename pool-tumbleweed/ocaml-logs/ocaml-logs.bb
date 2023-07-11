SUMMARY = "Logging infrastructure for OCaml"
DESCRIPTION = "Logs provides a logging infrastructure for OCaml. Logging is performed on sources whose reporting level can be set independently. Log message report is decoupled from logging and is handled by a reporter. \
 \
A few optional log reporters are distributed with the base library and the API easily allows to implement your own."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-logs-0.7.0-3.5.aarch64.rpm"
RPM_HASH = "42febf4216428fa81019b6a61be492841e0ecc08e86d404fc5aa273a167d4ae7d5623ff4c215c1bebadf7f752dbda4775b38a71f438ba3df1a8e6b645244728b"

RPROVIDES:${PN} += "ocaml-logs"

RDEPENDS:${PN} += ""

inherit rpm
