SUMMARY = "Paste On Www.Pastebin.Com Without Api Keys"
DESCRIPTION = "This module provides the means to paste on the www.pastebin.com manpage \
pastebin, without the need for http://pastebin.com/api. See the WARNING!!! \
section above."
LICENSE = "Artistic-2.0"

PV = "1.003"

RPM_NAME = "perl-WWW-Pastebin-PastebinCom-Create-1.003-1.24.noarch.rpm"
RPM_HASH = "3336fa656be5f2f6efcf81da690be70aeb60f5942cddffb194167788cd56fe5cd5b6878955746c9f2d79f0c5c61f6aafd42859b029fe0e0c99d92bb469a34939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(WWW::Pastebin::PastebinCom::Create) \
perl-WWW-Pastebin-PastebinCom-Create"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moo) \
perl(WWW::Mechanize)"

inherit rpm
