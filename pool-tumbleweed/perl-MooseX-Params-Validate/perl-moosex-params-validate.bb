SUMMARY = "an extension of Params::Validate using Moose's types"
DESCRIPTION = "This module fills a gap in Moose by adding method parameter validation to \
Moose. This is just one of many developing options, it should not be \
considered the 'official' one by any means though. \
 \
You might also want to explore 'MooseX::Method::Signatures' and \
'MooseX::Declare'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-MooseX-Params-Validate-0.21-1.26.noarch.rpm"
RPM_HASH = "f10bedc0b8a85f61f396ae9151f37372bb7aad3dec20272198c258a7b9f33ca017ba822ee331bffb15c5af04387ef29a9132f12fa5a7f98e9f80b8bab8b73112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Params--Validate \
perl-MooseX--Params--Validate--Exception--ValidationFailedForTypeConstraint \
perl-MooseX-Params-Validate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Caller \
perl-Moose \
perl-Moose--Exception \
perl-Moose--Util \
perl-Moose--Util--TypeConstraints \
perl-Params--Validate \
perl-Sub--Exporter"

inherit rpm
