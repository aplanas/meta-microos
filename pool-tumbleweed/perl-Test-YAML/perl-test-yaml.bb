SUMMARY = "Testing Module for YAML Implementations"
DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-Test-YAML-1.07-1.19.noarch.rpm"
RPM_HASH = "795b04b489c7752e557d5304ae93f00c9b724d611fee30ae85ed4258e260ad4ce7cfe554c5db7b6fb41de51732e10a478788255f90cc8e7b3d41aa3a561054bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--YAML \
perl-Test--YAML--Filter \
perl-Test-YAML"

RDEPENDS:${PN} += "/usr/bin/bash \
perl--MODULE-COMPAT-5.38.0 \
perl-Test--Base"

inherit rpm
