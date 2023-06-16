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

PV = "0.10.2"

RPM_NAME = "python311-pygn-0.10.2-2.4.noarch.rpm"
RPM_HASH = "da7c36fc34452a8ee379c583081f0fa7f3b61a65d554359da0e662ea0fa344a1f11531613031170d340b3af5589ef82e1d40fa955106e76f373c47b13ef78c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pygn \
python311-pygn \
python3dist-pygn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
