SUMMARY = "Parse and build a MIME Content-Type or Content-Disposition Header"
DESCRIPTION = "Parse and build a MIME Content-Type or Content-Disposition Header"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.028"

RPM_NAME = "perl-Email-MIME-ContentType-1.028-1.1.noarch.rpm"
RPM_HASH = "f063de9ef52c9c6b885439b0772da2611d5893863b8b7a442e8c683a4a70b27712f3e7bb7515c1858289d016eb9946f4e274be64c974201399ad914ef1e2d0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Email::MIME::ContentType) \
perl-Email-MIME-ContentType"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Encode) \
perl(Text::Unidecode)"

inherit rpm
