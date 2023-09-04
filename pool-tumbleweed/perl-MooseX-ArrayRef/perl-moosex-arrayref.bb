SUMMARY = "blessed arrayrefs with Moose"
DESCRIPTION = "Objects implemented with arrayrefs rather than hashrefs are often faster \
than those implemented with hashrefs. Moose's default object implementation \
is hashref based. Can we go faster? \
 \
Simply 'use MooseX::ArrayRef' instead of 'use Moose', but note the \
limitations in the section below. \
 \
The current implementation is mostly a proof of concept, but it does mostly \
seem to work."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.005"

RPM_NAME = "perl-MooseX-ArrayRef-0.005-1.27.noarch.rpm"
RPM_HASH = "7b80088ad29043ab428a1e9e55c9305bee2d8a17c9b991461dda7de91ae99934b0a7d5af49f6a013308dbd46c5aa6721b62cb8ef8289f83fb7f803257f25e4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--ArrayRef \
perl-MooseX--ArrayRef--Meta--Class \
perl-MooseX--ArrayRef--Meta--Instance \
perl-MooseX-ArrayRef"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
