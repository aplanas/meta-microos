SUMMARY = "Trim whitespace from your strings"
DESCRIPTION = "'String::Trim' trims whitespace off your strings. chomp trims only '$/' \
(typically, that's newline), but 'trim' will trim all leading and trailing \
whitespace."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-String-Trim-0.005-1.11.noarch.rpm"
RPM_HASH = "41c8ac3412a7b438242b15d8a254c3c0404c8d66a126779a754ebaccd11dddaa32560b2bc4a2c7813393759fe7b03a9b16a67a104e25c1b02ca9919aa141ebb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Trim \
perl-String-Trim"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
