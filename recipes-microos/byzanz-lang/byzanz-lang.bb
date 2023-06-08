SUMMARY = "Translations for package byzanz"
DESCRIPTION = "Provides translations for the 'byzanz' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0+git20140619"

RPM_NAME = "byzanz-lang-0.3.0+git20140619-5.9.noarch.rpm"
RPM_HASH = "e5555603eafc19465a0fbbcf078e5297eac9b2be9467c7a323b33f57bfbd3b694270ae4f104d422ba7c8df03e1bb42ba538737b67ef8f24393689dbea42905f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byzanz-lang byzanz-lang-all locale(byzanz:ar) locale(byzanz:ca) locale(byzanz:cs) locale(byzanz:da) locale(byzanz:de) locale(byzanz:dz) locale(byzanz:el) locale(byzanz:en_GB) locale(byzanz:es) locale(byzanz:fi) locale(byzanz:fr) locale(byzanz:gl) locale(byzanz:hu) locale(byzanz:id) locale(byzanz:it) locale(byzanz:ja) locale(byzanz:lv) locale(byzanz:nb) locale(byzanz:oc) locale(byzanz:pl) locale(byzanz:pt_BR) locale(byzanz:ro) locale(byzanz:ru) locale(byzanz:sl) locale(byzanz:sr) locale(byzanz:sr@latin) locale(byzanz:sv) locale(byzanz:tr) locale(byzanz:uk) locale(byzanz:vi) locale(byzanz:zh_CN)"
RDEPENDS:${PN} += "byzanz"

inherit rpm
