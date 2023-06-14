SUMMARY = "A Source Package for Dictionaries Used by MySpell"
DESCRIPTION = "This source package contains dictionaries for MySpell. \
 \
The MySpell spell-checker is used by the Libreoffice office suite, \
the Mozilla Composer, and the Mozilla Mail message composition window."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-dictionaries-20221012-1.2.aarch64.rpm"
RPM_HASH = "239e40bdba75e46baefb336a123e32e04383ee903efa1b60da148b49b3c5a5886427516b30bbb63b4a018d898f597bc6f563693099831a5954875ddf54dda240"

RPROVIDES:${PN} += "myspell-dictionaries"

RDEPENDS:${PN} += ""

inherit rpm
