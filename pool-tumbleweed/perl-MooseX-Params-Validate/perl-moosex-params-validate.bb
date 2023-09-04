SUMMARY = "an extension of Params::Validate using Moose's types"
DESCRIPTION = "This module fills a gap in Moose by adding method parameter validation to \
Moose. This is just one of many developing options, it should not be \
considered the 'official' one by any means though. \
 \
You might also want to explore 'MooseX::Method::Signatures' and \
'MooseX::Declare'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-MooseX-Params-Validate-0.21-1.27.noarch.rpm"
RPM_HASH = "b24f97fd93866d7b32fc6d7246e375091d69b52e9fb2fee5462fc7c60fee56cb10bb2f97346f37cda4c059b85ae0b3bd9e4148954b0ad64147ad363f22aa5286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Params--Validate \
perl-MooseX--Params--Validate--Exception--ValidationFailedForTypeConstraint \
perl-MooseX-Params-Validate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--Caller \
perl-Moose \
perl-Moose--Exception \
perl-Moose--Util \
perl-Moose--Util--TypeConstraints \
perl-Params--Validate \
perl-Sub--Exporter"

inherit rpm
