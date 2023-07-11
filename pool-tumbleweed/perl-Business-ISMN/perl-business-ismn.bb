SUMMARY = "Work with International Standard Music Numbers"
DESCRIPTION = "work with International Standard Music Numbers"
LICENSE = "Artistic-2.0"

PV = "1.203"

RPM_NAME = "perl-Business-ISMN-1.203-1.2.noarch.rpm"
RPM_HASH = "920f52423d1e5c0cf02af9ba1536b967aef3b5e15bd1c9a00976cbda4dfbf47260748cc09ac67a9b57331c7bbb44f90a3fe8b6db5a00af01e0d99f8297a7f1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISMN \
perl-Business--ISMN--Data \
perl-Business-ISMN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Tie--Cycle"

inherit rpm
