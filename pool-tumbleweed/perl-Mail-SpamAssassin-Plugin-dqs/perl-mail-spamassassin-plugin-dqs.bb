SUMMARY = "SpamAssassin plugin for Spamhaus Data Query Service (DQS)"
DESCRIPTION = "The Spamhaus Data Query Service (DQS) plugin for SpamAssassin enhances \
existing functions by checking HELO/EHLO, From, Reply-To, Envelope-From \
and Return-Path against Spamhaus DBL/ZRD blacklists. It also scans the \
e-mail body for e-mail addresses and performs blacklist lookups against \
the domains or its authoritative nameservers. Further checks cover the \
reverse DNS matches in DBL/ZRD blacklists or the SBL/CSS lookups for IP \
addresses or IP addresses of authoritative nameservers of domains being \
part of the e-mail body. \
 \
While the DQS usage is free under the same terms like when using public \
mirrors (which are shipped in SpamAssassin as default configuration), a \
registration procedure for a free DQS key is mandatory nevertheless."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-dqs-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "79990466cdd0534dd9421300148db891b983f541b345aafc59818899550c8cc9266c5ac121adadc723a1aea5e3594a87225ddae8b6e137fcbfd8004906137410"

RPROVIDES:${PN} += "config-perl-Mail-SpamAssassin-Plugin-dqs \
perl-Mail--SpamAssassin--Plugin--SH \
perl-Mail-SpamAssassin-Plugin-dqs"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.38.0 \
spamassassin"

inherit rpm
