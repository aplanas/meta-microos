SUMMARY = "Syndication feed auto-discovery"
DESCRIPTION = "_Feed::Find_ implements feed auto-discovery for finding syndication feeds, \
given a URI. It (currently) passes all of the auto-discovery tests at \
_http://diveintomark.org/tests/client/autodiscovery/_. \
 \
_Feed::Find_ will discover the following feed formats: \
 \
* * RSS 0.91 \
 \
* * RSS 1.0 \
 \
* * RSS 2.0 \
 \
* * Atom"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Feed-Find-0.13-1.3.noarch.rpm"
RPM_HASH = "c3f574155d113dd715ae8e778cf531fd6ad6935af862914dac19b735cab5c002df306f2367108af530a88223ac6389b5a3ab705b416aeae3c0a87eab755b7502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feed--Find \
perl-Feed-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--ErrorHandler \
perl-HTML--Parser \
perl-LWP \
perl-URI"

inherit rpm
