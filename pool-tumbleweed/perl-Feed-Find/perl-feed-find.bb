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

RPM_NAME = "perl-Feed-Find-0.13-1.2.noarch.rpm"
RPM_HASH = "8df23a1e0bfeea0ce5fd0057a60bd3a0ed21beeace83a2fba0ed7cb0458ddfce32c588702b130d9bdc7f54c548e8be1865e56d2387911b246cff45a0fb66372f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feed--Find \
perl-Feed-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Class--ErrorHandler \
perl-HTML--Parser \
perl-LWP \
perl-URI"

inherit rpm
