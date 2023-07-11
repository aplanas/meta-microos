SUMMARY = "Make your object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it calls 'Moose->throw_error()'. This is a great way to \
catch small typos."
LICENSE = "Artistic-2.0"

PV = "0.21"

RPM_NAME = "perl-MooseX-StrictConstructor-0.21-1.23.noarch.rpm"
RPM_HASH = "ffbe9205f30c2c3d809bd5452976ee455162216e9b809f7574b05a55c02e4a540cbe87af1869e7bb4756b2643d48bf1c888845ad482c7338dc8ddc090e9c18bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--StrictConstructor \
perl-MooseX--StrictConstructor--Trait--Class \
perl-MooseX--StrictConstructor--Trait--Method--Constructor \
perl-MooseX-StrictConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean"

inherit rpm
