SUMMARY = "Unload a class"
DESCRIPTION = "Unload a class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Class-Unload-0.11-1.24.noarch.rpm"
RPM_HASH = "18ef96585467a690906d46c3ca64e8f41bf1928bab5a34cf06fb2b1840711b2a8aad0e799b2efd9d95f486444ca1487491b9953d6c2859d535eb4840b36a8af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Unload \
perl-Class-Unload"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Inspector"

inherit rpm
