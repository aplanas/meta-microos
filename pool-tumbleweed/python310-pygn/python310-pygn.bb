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

RPM_NAME = "python310-pygn-0.10.2-2.4.noarch.rpm"
RPM_HASH = "275a9865b2f25b727998b5efdc2d10f5427a96b41d2ca590ce7f0730511b4aa7357cf638925f232d6054c464072d4a3a7d2db1aa9ff6f239d1af42ece3572621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygn \
python3.10dist(pygn) \
python310-pygn \
python3dist(pygn)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
