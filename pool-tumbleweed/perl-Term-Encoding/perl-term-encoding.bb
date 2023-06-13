SUMMARY = "Detect encoding of the current terminal"
DESCRIPTION = "Term::Encoding is a simple module to detect an encoding the current \
terminal expects, in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Term-Encoding-0.03-1.15.noarch.rpm"
RPM_HASH = "407670cc231121568cefe0f67e229b79f448e494f2341c71d6f14bae07204f0b51f3201e8ce2d1e9f4c238e8b1c71b54afb7fad05d4a1bd4b157a690f3205fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Term::Encoding) \
perl-Term-Encoding"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
