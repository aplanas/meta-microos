SUMMARY = "Web service API to MusicBrainz database"
DESCRIPTION = "API to search the musicbrainz.org database"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.6"

RPM_NAME = "perl-WebService-MusicBrainz-1.0.6-1.3.noarch.rpm"
RPM_HASH = "b09bc47002809a47e725c1421a40bd3c095fdb0841983fa95d25c0a8d5e14807b333bc757f6021d4bb1cb15a24f3afcd8f32c0e72077a9f2c7c6b4add100f436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WebService--MusicBrainz \
perl-WebService--MusicBrainz--Request \
perl-WebService-MusicBrainz"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mojolicious"

inherit rpm
