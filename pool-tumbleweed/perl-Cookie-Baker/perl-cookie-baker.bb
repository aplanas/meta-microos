SUMMARY = "Cookie string generator / parser"
DESCRIPTION = "Cookie::Baker provides simple cookie string generator and parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Cookie-Baker-0.11-1.17.noarch.rpm"
RPM_HASH = "9bf63dd3e79f3fd8e6023f56f7c070419b10a6efd990fb5b0bf536d016241f868ca531059be07585dbb5a22e661b2905faf409d27f0ecea08b2f6329e8bcca06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cookie--Baker \
perl-Cookie-Baker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI--Escape"

inherit rpm
