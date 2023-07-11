SUMMARY = "The iXhash plugin for SpamAssassin"
DESCRIPTION = "This archive contains the iXhash2 plugin for the SpamAssassin spam filtering \
software, along with an example config file. \
 \
Basically the plugin provides a network-based test just as razor2, pyzor \
and DCC do. Working solely on the body of an email, it removes parts of it \
and computes a hash value from the rest. These values will then be looked up \
via DNS using the domains given in the config file(s)."
LICENSE = "Apache-2.0"

PV = "4.00"

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-iXhash2-4.00-74.5.noarch.rpm"
RPM_HASH = "b7474982bb6aad07087a2a6cc1ca6e228d6868ae0eba0a0e8adc46a909d2d1fc5d63338f8df597646936735632e0f60aabf48f486d8cb3dfaf22b9304ff60aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-Mail-SpamAssassin-Plugin-iXhash2 \
perl-Mail--SpamAssassin--Plugin--iXhash2 \
perl-Mail-SpamAssassin-Plugin-iXhash \
perl-Mail-SpamAssassin-Plugin-iXhash2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--MD5 \
perl-Mail--SpamAssassin"

inherit rpm
