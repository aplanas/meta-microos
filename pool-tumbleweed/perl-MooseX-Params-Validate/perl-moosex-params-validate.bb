SUMMARY = "an extension of Params::Validate using Moose's types"
DESCRIPTION = "This module fills a gap in Moose by adding method parameter validation to \
Moose. This is just one of many developing options, it should not be \
considered the 'official' one by any means though. \
 \
You might also want to explore 'MooseX::Method::Signatures' and \
'MooseX::Declare'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-MooseX-Params-Validate-0.21-1.25.noarch.rpm"
RPM_HASH = "53af152562cf7c7d981da29d869403cdab61ccb93d061a1911d61f3beb2e4cbcafdcdd52e19c8a35257375539cb661afb329b47d37d9a6bc63cde2fae1ec59e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Params--Validate \
perl-MooseX--Params--Validate--Exception--ValidationFailedForTypeConstraint \
perl-MooseX-Params-Validate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Devel--Caller \
perl-Moose \
perl-Moose--Exception \
perl-Moose--Util \
perl-Moose--Util--TypeConstraints \
perl-Params--Validate \
perl-Sub--Exporter"

inherit rpm
