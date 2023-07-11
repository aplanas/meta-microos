SUMMARY = "Parse and build a MIME Content-Type or Content-Disposition Header"
DESCRIPTION = "Parse and build a MIME Content-Type or Content-Disposition Header"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.028"

RPM_NAME = "perl-Email-MIME-ContentType-1.028-1.2.noarch.rpm"
RPM_HASH = "7caf5014b659f7a929af059ccf810e7410372e215457bac04f856a8210a04d2d684e3a13e5f85297794cb4553600b004fdad3ac0be1731b0f301dbd3fa0717f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME--ContentType \
perl-Email-MIME-ContentType"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Encode \
perl-Text--Unidecode"

inherit rpm
