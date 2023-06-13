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

RPM_NAME = "perl-Mail-SpamAssassin-Plugin-iXhash2-4.00-74.3.noarch.rpm"
RPM_HASH = "aa9aa488c593ee4d02a13e8bcf6a52fe9f86d39614ad83396ea497dcb0f491106daa43668d01ae48104edf72af701ec1333f683951c34c7ea4e0d9c8168564d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(perl-Mail-SpamAssassin-Plugin-iXhash2) \
perl(Mail::SpamAssassin::Plugin::iXhash2) \
perl-Mail-SpamAssassin-Plugin-iXhash \
perl-Mail-SpamAssassin-Plugin-iXhash2"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Digest::MD5) \
perl(Mail::SpamAssassin)"

inherit rpm
