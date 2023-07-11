SUMMARY = "Tools of libpreludedb"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type \
and the format of the database used to store IDMEF alerts. It \
allows developers to use the Prelude IDMEF database easily and \
efficiently without worrying about SQL, and to access the \
database independently of the type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "preludedb-tools-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "6362cd24badd181d23d5c74223b9dd7a20a522bc11692b9ed9730865261a8b198c93bd8f8411f854bb194983ea5b9078e03b4faf258e46382bf0c37e939ec7ae"

RPROVIDES:${PN} += "preludedb-tools"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
