SUMMARY = "Development files for the TrueType Font Engine"
DESCRIPTION = "A library for working with TrueType Fonts. Documentation is in the \
/usr/share/doc/packages/freetype directory."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "freetype-devel-1.3.1-1419.13.aarch64.rpm"
RPM_HASH = "5b7ae09b1b81be3be933a1a355b186fe6a83232009912a3720211fab62acb8256a99d40551ee7497fdfe55d905deabbe5f86b842f0150925229e0411200b8091"

RPROVIDES:${PN} += "freetype-devel"

RDEPENDS:${PN} += "libttf2"

inherit rpm
