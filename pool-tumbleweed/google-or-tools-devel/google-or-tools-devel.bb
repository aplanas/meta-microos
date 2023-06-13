SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Development files (C/C++) for the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-devel-9.6-1.1.aarch64.rpm"
RPM_HASH = "1353a361bef9fff3fb7b9d31dbdfa8dedec2bd2bf4f28be0e61cee7c38f67e861c6b659bf06e275218af6e84f299a156047aa3bab6c386b64650dbc7172ddd66"

RPROVIDES:${PN} += "cmake(ortools) \
google-or-tools-devel \
google-or-tools-devel(aarch-64)"

RDEPENDS:${PN} += "libortools9 \
libortools_flatzinc9"

inherit rpm
