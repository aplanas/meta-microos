SUMMARY = "Trim whitespace from your strings"
DESCRIPTION = "'String::Trim' trims whitespace off your strings. chomp trims only '$/' \
(typically, that's newline), but 'trim' will trim all leading and trailing \
whitespace."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-String-Trim-0.005-1.10.noarch.rpm"
RPM_HASH = "4c0369741bdbfcb3d19dfec10f603b5ecfce3643eb57fd92177481429d8cc12775bfc8083770aa4b7b5ad7f378384e290d5533af268d79980d6c038d02141f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Trim \
perl-String-Trim"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
