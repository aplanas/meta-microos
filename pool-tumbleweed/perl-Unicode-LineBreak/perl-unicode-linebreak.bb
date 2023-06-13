SUMMARY = "UAX #14 Unicode Line Breaking Algorithm"
DESCRIPTION = "Unicode::LineBreak performs Line Breaking Algorithm described in Unicode \
Standard Annex #14 [UAX #14]. East_Asian_Width informative property defined \
by Annex #11 [UAX #11] will be concerned to determine breaking positions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2019.001"

RPM_NAME = "perl-Unicode-LineBreak-2019.001-1.25.aarch64.rpm"
RPM_HASH = "2d62ae8d25e99f2665580396f8adaf7d1db3a934fc1d9cb0ac29e8ad10355f14d128137d97b34c98084a750bbfedbf7873abddc01ac394cd28ba7f2b6f55e1c7"

RPROVIDES:${PN} += "perl(Text::LineFold) \
perl(Unicode::GCString) \
perl(Unicode::LineBreak) \
perl-Unicode-LineBreak \
perl-Unicode-LineBreak(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(MIME::Charset)"

inherit rpm
