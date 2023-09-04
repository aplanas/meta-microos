SUMMARY = "Trim whitespace from your strings"
DESCRIPTION = "'String::Trim' trims whitespace off your strings. chomp trims only '$/' \
(typically, that's newline), but 'trim' will trim all leading and trailing \
whitespace."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-String-Trim-0.005-1.12.noarch.rpm"
RPM_HASH = "66b3b426d97265118d8db2e284c59e7bf5a049a078d4a683d1e7ffe1af4841b2d67f9c403d3acd47279c8dd5fd4fda7b3f63f893fbba8479512729a5b3ac0838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Trim \
perl-String-Trim"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
