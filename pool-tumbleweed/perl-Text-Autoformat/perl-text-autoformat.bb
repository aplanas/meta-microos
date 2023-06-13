SUMMARY = "Automatic text wrapping and reformatting"
DESCRIPTION = "Automatic text wrapping and reformatting"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-Text-Autoformat-1.75-1.15.noarch.rpm"
RPM_HASH = "55d999ae2eb8400f76db6050d7f4b8ad2e295948049b1cf3b86bd1e4ee5b0976450b900b7e751bef66964a5123d8ddb0a2a2171e354d67e3d2e48863d894c330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Autoformat) \
perl(Text::Autoformat::Hang) \
perl(Text::Autoformat::NullHang) \
perl-Text-Autoformat"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Text::Reform)"

inherit rpm
