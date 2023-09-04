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

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-iXhash2-4.00-74.6.noarch.rpm"
RPM_HASH = "c5ac501d4a24404e312e044ba0ef81e2612c6e5a7dd5a105aa8dc414856ec018eb198fef809c2668e5a576a614ebcbbdbde2473451810abf198a3d3e286e86c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-Mail-SpamAssassin-Plugin-iXhash2 \
perl-Mail--SpamAssassin--Plugin--iXhash2 \
perl-Mail-SpamAssassin-Plugin-iXhash \
perl-Mail-SpamAssassin-Plugin-iXhash2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--MD5 \
perl-Mail--SpamAssassin"

inherit rpm
