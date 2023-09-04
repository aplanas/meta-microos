SUMMARY = "Use semantic version numbers"
DESCRIPTION = "Use semantic version numbers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-SemVer-0.10.0-1.4.noarch.rpm"
RPM_HASH = "72c4e2719c759fa447bfd7ccb778e51a6e9e5c24775f4359546abbff8ea74ab26c16a238fbc763f8cb96e3348af7a55ebfda72a5260d7e9a7f7fb604eeb4e82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SemVer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-version"

inherit rpm
