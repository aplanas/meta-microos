SUMMARY = "Paste On Www.Pastebin.Com Without Api Keys"
DESCRIPTION = "This module provides the means to paste on the www.pastebin.com manpage \
pastebin, without the need for http://pastebin.com/api. See the WARNING!!! \
section above."
LICENSE = "Artistic-2.0"

PV = "1.003"

RPM_NAME = "perl-WWW-Pastebin-PastebinCom-Create-1.003-1.25.noarch.rpm"
RPM_HASH = "14b282d6259a0da402436259cdbeaf5ba5093e55389ce67228bff821e32a7594506616e9c7d3f02486c25ebc73bea8305149734d73e30cb4f9d4d62b4af3d700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Pastebin--PastebinCom--Create \
perl-WWW-Pastebin-PastebinCom-Create"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moo \
perl-WWW--Mechanize"

inherit rpm
