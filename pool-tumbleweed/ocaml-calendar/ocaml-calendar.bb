SUMMARY = "Objective Caml library for managing dates and times"
DESCRIPTION = "Objective Caml library for managing dates and times."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "ocaml-calendar-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "1baf718a344ce49299aceb7c4650697544563c3522a820ab77af1448b63c5b281c37a96d43393e520f768b6dd852ac9ff78bb7a292815c56810f85d71dc07334"

RPROVIDES:${PN} += "ocaml-calendar"

RDEPENDS:${PN} += ""

inherit rpm
