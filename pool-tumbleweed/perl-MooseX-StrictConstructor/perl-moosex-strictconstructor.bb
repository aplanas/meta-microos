SUMMARY = "Make your object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it calls 'Moose->throw_error()'. This is a great way to \
catch small typos."
LICENSE = "Artistic-2.0"

PV = "0.21"

RPM_NAME = "perl-MooseX-StrictConstructor-0.21-1.24.noarch.rpm"
RPM_HASH = "3a2f54c92a63289b7109e80c071e69595cc14394f5fa1819c89a7b286ced24362504325bb8c9737323527468f8bdf8c653fb30a72ed7e08b515f19d6b97b2933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--StrictConstructor \
perl-MooseX--StrictConstructor--Trait--Class \
perl-MooseX--StrictConstructor--Trait--Method--Constructor \
perl-MooseX-StrictConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean"

inherit rpm
