SUMMARY = "Detect encoding of the current terminal"
DESCRIPTION = "Term::Encoding is a simple module to detect an encoding the current \
terminal expects, in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Term-Encoding-0.03-1.17.noarch.rpm"
RPM_HASH = "84daae9de3ff8761c779679693cb649bfe70445b0547e6de2ce16197737af8d3c51eb64ce2d50f315d96932fc014fde9ec6d47af8411c799e5218ce475464e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Encoding \
perl-Term-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
