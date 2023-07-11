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

RPM_NAME = "python39-pygn-0.11.0-1.1.noarch.rpm"
RPM_HASH = "430d812945947e051d7d3b48a1e410d82392426a8bc4801ba7cfac22ce983e6237ac6e83d25dbb2bc08d1fa1c94ee32159b9babbc8d4f0fe4a864784ad70aa5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygn \
python39-pygn \
python3dist-pygn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-rply \
update-alternatives"

inherit rpm
