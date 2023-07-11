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

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-dqs-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "6e55c92e339c0d67ec8262b2e34f0a9689b762a70f0d595f480f5a06d2d39c0780324a605ddc998bcc960623bba07cf7373176f1318755e2c420b9b4b13f934c"

RPROVIDES:${PN} += "config-perl-Mail-SpamAssassin-Plugin-dqs \
perl-Mail--SpamAssassin--Plugin--SH \
perl-Mail-SpamAssassin-Plugin-dqs"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.36.1 \
spamassassin"

inherit rpm
