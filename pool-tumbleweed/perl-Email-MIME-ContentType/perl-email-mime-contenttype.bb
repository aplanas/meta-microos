SUMMARY = "Parse and build a MIME Content-Type or Content-Disposition Header"
DESCRIPTION = "Parse and build a MIME Content-Type or Content-Disposition Header"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.028"

RPM_NAME = "perl-Email-MIME-ContentType-1.028-1.3.noarch.rpm"
RPM_HASH = "6da1233dc8792275524f16f6d180797453ef23bf1ed6087c4307c717685d05617d48b9ea1303fafc44bbbc5ca361ce6d785a0674757efad8f5ca78b704c03121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME--ContentType \
perl-Email-MIME-ContentType"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Encode \
perl-Text--Unidecode"

inherit rpm
