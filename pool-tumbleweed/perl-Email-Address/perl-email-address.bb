SUMMARY = "RFC 2822 Address Parsing and Creation"
DESCRIPTION = "This class implements a regex-based RFC 2822 parser that locates email \
addresses in strings and returns a list of 'Email::Address' objects found. \
Alternatively you may construct objects manually. The goal of this software \
is to be correct, and very very fast. \
 \
Version 1.909 and earlier of this module had vulnerabilies (at \
https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2015-7686) and (at \
https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2018-12558) which \
allowed specially constructed email to cause a denial of service. The \
reported vulnerabilities and some other pathalogical cases (meaning they \
really shouldn't occur in normal email) have been addressed in version \
1.910 and newer. If you're running version 1.909 or older, you should \
update! \
 \
Alternatively, you could switch to *Email::Address::XS* which has a \
backward compatible API. *Why not just use that?*"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.913"

RPM_NAME = "perl-Email-Address-1.913-1.2.noarch.rpm"
RPM_HASH = "a44888d3b446e420089449286baf09d0e138d9710d578fc3dacd14b53a43c8617499c505179deb730eb6b2366604e8d2294b538dc58ef9a092c3253fd5df2a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Address \
perl-Email-Address"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
