SUMMARY = "The Python Gateway Script: news2mail mail2news gateway"
DESCRIPTION = "Python Gateway Script from news to mail and vice versa. \
 \
It is intended to be a full SMTP/NNTP rfc compliant gateway \
with whitelist manager. \
 \
You will probably have to install a mail-transport-agent and/or \
news-transport-system package to manage SMTP/NNTP traffic. \
 \
MTA is needed for mail2news service, since mail have to be \
processed on a box where pyg is installed. You can use a remote \
smtpserver for news2mail. \
 \
News system is useful but not needed, since you can send articles to a \
remote SMTP server (ie: moderated NG) where is installed pyg, otherwise you \
will need it. \
 \
It refers to rfc 822 (mail) and 850 (news)."
LICENSE = "GPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "python311-pygn-0.11.0-1.1.noarch.rpm"
RPM_HASH = "57c5b22863808b65b355ca9c574e1fbc6b03b5b3895aa529f3a8ef5458f426654bdf94e801a94b920af6bacd63649984038b1a72d3fd92dd483290857da5ff43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygn \
python3.11dist-pygn \
python311-pygn \
python3dist-pygn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-rply \
update-alternatives"

inherit rpm
