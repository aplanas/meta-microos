SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-locale-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "6c0b19517eb49cd9e5b8d406711814fbcaae11312f777c1f24ffd1215ac8c14e99ba03212fa106ef403286ebb2a5c92e6c633e4f51b3261898aa27504bb14a48"

RPROVIDES:${PN} += "gcc12-locale \
gcc12-locale(aarch-64) \
locale(gcc12:be) \
locale(gcc12:ca) \
locale(gcc12:da) \
locale(gcc12:de) \
locale(gcc12:el) \
locale(gcc12:eo) \
locale(gcc12:es) \
locale(gcc12:fi) \
locale(gcc12:fr) \
locale(gcc12:hr) \
locale(gcc12:id) \
locale(gcc12:ja) \
locale(gcc12:ka) \
locale(gcc12:nl) \
locale(gcc12:pt_BR) \
locale(gcc12:ro) \
locale(gcc12:ru) \
locale(gcc12:sr) \
locale(gcc12:sv) \
locale(gcc12:tr) \
locale(gcc12:uk) \
locale(gcc12:vi) \
locale(gcc12:zh_CN) \
locale(gcc12:zh_TW)"

RDEPENDS:${PN} += "gcc12"

inherit rpm
