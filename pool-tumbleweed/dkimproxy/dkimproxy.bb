SUMMARY = "DKIMproxy is an SMTP-proxy that implements the DKIM and DomainKeys standards"
DESCRIPTION = "DKIMproxy is an SMTP-proxy that signs and/or verifies emails, using the \
Mail::DKIM module. It is designed for Postfix, but should work with any \
mail server. It comprises two separate proxies, an 'outbound' proxy for \
signing outgoing email, and an 'inbound' proxy for verifying signatures \
of incoming email. With Postfix, the proxies can operate as either \
Before-Queue or After-Queue content filters."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "dkimproxy-1.4.1-15.6.noarch.rpm"
RPM_HASH = "663da0b36130ce1e255a09803c7a8162112852afce617f746f5baf623ef86123042474471c29e6f5eae6d2185e68c3a2667925ed279eaa8eb80a7177bc7cc9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dkimproxy \
perl-LookupMap \
perl-MSDW--SMTP--Client \
perl-MSDW--SMTP--Server \
perl-MySmtpProxyServer \
perl-MySmtpServer"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
git-core \
perl-IO--Socket--INET6 \
perl-Mail-DKIM \
perl-Net-Server \
pwdutils"

inherit rpm
