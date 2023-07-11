SUMMARY = "DKIMproxy is an SMTP-proxy that implements the DKIM and DomainKeys standards"
DESCRIPTION = "DKIMproxy is an SMTP-proxy that signs and/or verifies emails, using the \
Mail::DKIM module. It is designed for Postfix, but should work with any \
mail server. It comprises two separate proxies, an 'outbound' proxy for \
signing outgoing email, and an 'inbound' proxy for verifying signatures \
of incoming email. With Postfix, the proxies can operate as either \
Before-Queue or After-Queue content filters."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "dkimproxy-1.4.1-15.7.noarch.rpm"
RPM_HASH = "17032289e0f8efe8b854622b167b49e59bebdf8971abdd82f6d30f08288076d0c8df49d77dc3bc93a22bbf31022f6afcfe85a8ecf41bf5e7d3f10502353d1d5f"
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
