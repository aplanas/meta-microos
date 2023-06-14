SUMMARY = "Logging infrastructure for OCaml"
DESCRIPTION = "Logs provides a logging infrastructure for OCaml. Logging is performed on sources whose reporting level can be set independently. Log message report is decoupled from logging and is handled by a reporter. \
 \
A few optional log reporters are distributed with the base library and the API easily allows to implement your own."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-logs-0.7.0-3.4.aarch64.rpm"
RPM_HASH = "8af949b4394cb71178bb6be7ce769be0ac187ca0a317745c05bcde127b2291416d713b2ab72ca4786b662b9a4aff4f5f50962b01f7d70af80fa28c1f7aec2c08"

RPROVIDES:${PN} += "ocaml-logs"

RDEPENDS:${PN} += ""

inherit rpm
