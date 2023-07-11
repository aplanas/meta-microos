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

RPM_NAME = "python310-pygn-0.11.0-1.1.noarch.rpm"
RPM_HASH = "87b24faee315eecf5f635aa831e1b2e00e9e6b992954c9f355b9a1ec1c73589b759a40631306605b280af545d8c8e2041666f077d3bef5b977146b834aaf5293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygn \
python310-pygn \
python3dist-pygn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-rply \
update-alternatives"

inherit rpm
