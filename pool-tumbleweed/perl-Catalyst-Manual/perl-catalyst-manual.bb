SUMMARY = "The Catalyst developer's manual"
DESCRIPTION = "The Catalyst developer's manual"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.9011"

RPM_NAME = "perl-Catalyst-Manual-5.9011-1.15.noarch.rpm"
RPM_HASH = "209753a215b585794431823ab75975ad3eadcae483ce87301dc5dd84880011c6dac1b0eb1d87df9353954660b1e4f31ac8f0fb86b45544193002171d9b0407b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Catalyst--Manual \
perl-Catalyst-Manual"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
