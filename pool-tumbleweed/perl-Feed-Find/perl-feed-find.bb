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

RPM_NAME = "perl-Feed-Find-0.13-1.4.noarch.rpm"
RPM_HASH = "11fe2226b7ad2664cbe34ee61d45defd222527ac371cc00de6d95292fb9fb7b3c6a7f8e0248aed5af859b49832ca2cc309adade0b2f783639fa7613f16915133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Feed--Find \
perl-Feed-Find"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--ErrorHandler \
perl-HTML--Parser \
perl-LWP \
perl-URI"

inherit rpm
