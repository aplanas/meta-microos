SUMMARY = "Detect encoding of the current terminal"
DESCRIPTION = "Term::Encoding is a simple module to detect an encoding the current \
terminal expects, in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Term-Encoding-0.03-1.16.noarch.rpm"
RPM_HASH = "a2a1ba5dfaa57168cc61976703d6adc59ddfbac1248dd7221ba4faaf1fddc3d621fe63117d684350a0a7157149158efd82b726775889d883c434f3c902928887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Encoding \
perl-Term-Encoding"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
