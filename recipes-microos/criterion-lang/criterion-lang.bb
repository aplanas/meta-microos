SUMMARY = "Translations for package criterion"
DESCRIPTION = "Provides translations for the 'criterion' package."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "criterion-lang-2.4.1-1.4.noarch.rpm"
RPM_HASH = "7f4f48945c0b4583a71ea21f877e7380fb92942a523f8964eccfcc18d20cc999715167091d9506a3ea5189b644ed5eb88b0315f9ac2ffa35746488e1aa50058d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "criterion-lang criterion-lang-all locale(criterion:de) locale(criterion:fr)"
RDEPENDS:${PN} += "criterion"

inherit rpm
