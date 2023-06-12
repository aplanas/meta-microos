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

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-dqs-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "0d0a1bc6dba5832b48ec0d104163874d977e7fbd24a88af524a5f0b5d5a5d16575b89be91839d1072253a9eeeb3d5716b06d7823dae9273976eabf40c50e4bd7"

RPROVIDES:${PN} += "config(perl-Mail-SpamAssassin-Plugin-dqs) \
perl(Mail::SpamAssassin::Plugin::SH) \
perl-Mail-SpamAssassin-Plugin-dqs \
perl-Mail-SpamAssassin-Plugin-dqs(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
perl(:MODULE_COMPAT_5.36.0) \
spamassassin"

inherit rpm
