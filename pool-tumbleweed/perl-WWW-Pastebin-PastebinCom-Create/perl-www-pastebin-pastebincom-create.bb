SUMMARY = "Paste On Www.Pastebin.Com Without Api Keys"
DESCRIPTION = "This module provides the means to paste on the www.pastebin.com manpage \
pastebin, without the need for http://pastebin.com/api. See the WARNING!!! \
section above."
LICENSE = "Artistic-2.0"

PV = "1.003"

RPM_NAME = "perl-WWW-Pastebin-PastebinCom-Create-1.003-1.26.noarch.rpm"
RPM_HASH = "5bbf8eebd9f83a9855be84c38809e3377374bf629dc29196b2bb6195a5a48dea105c9a3109f3b1dc87b16442bb9970c5193ad0d6a69f1d557f9f917fdad04539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Pastebin--PastebinCom--Create \
perl-WWW-Pastebin-PastebinCom-Create"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo \
perl-WWW--Mechanize"

inherit rpm
