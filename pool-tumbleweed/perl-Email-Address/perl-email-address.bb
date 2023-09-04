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

RPM_NAME = "perl-Email-Address-1.913-1.3.noarch.rpm"
RPM_HASH = "1c679631836ed8097008c056e51b304032328ff6d7a28ca94546ab1ca2899148fc394c58259baad0ec70503fc0657b0524f6331d64e20a6007f2b2b7426ffd99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Address \
perl-Email-Address"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
