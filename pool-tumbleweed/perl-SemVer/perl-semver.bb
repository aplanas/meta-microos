SUMMARY = "Use semantic version numbers"
DESCRIPTION = "Use semantic version numbers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-SemVer-0.10.0-1.3.noarch.rpm"
RPM_HASH = "4bb5800692ed8d1f798255fbe21ebabc95766b3c18f05448ca0a3129cb33ed299ada577fd501d39a1b785fed10d053384debb161a2dcb07b5688634f7663b51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SemVer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-version"

inherit rpm
