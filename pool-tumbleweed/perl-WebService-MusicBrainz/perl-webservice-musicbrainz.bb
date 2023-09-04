SUMMARY = "Web service API to MusicBrainz database"
DESCRIPTION = "API to search the musicbrainz.org database"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.6"

RPM_NAME = "perl-WebService-MusicBrainz-1.0.6-1.4.noarch.rpm"
RPM_HASH = "72f6df37c8c4c2781e5b6a0502ec77fb05b276e3904d5d409941fbc18c719bb9f1e8cd9ab4b7336d0ee7148b09ccbff176a4b8bd250c4ee5969b27d7128d8762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WebService--MusicBrainz \
perl-WebService--MusicBrainz--Request \
perl-WebService-MusicBrainz"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mojolicious"

inherit rpm
