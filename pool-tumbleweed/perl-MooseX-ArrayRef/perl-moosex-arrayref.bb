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

RPM_NAME = "perl-MooseX-ArrayRef-0.005-1.26.noarch.rpm"
RPM_HASH = "c8c18a958e5834e54ed4e5db6809b40056db963cb9dc1976dd1a322148eb2f3fb28cdfdca3cbbf7aba9b92730217dd43225e65cb6428e46e22183e5acdf859ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--ArrayRef \
perl-MooseX--ArrayRef--Meta--Class \
perl-MooseX--ArrayRef--Meta--Instance \
perl-MooseX-ArrayRef"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
