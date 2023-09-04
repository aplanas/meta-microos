SUMMARY = "Mark overload code symbols as methods"
DESCRIPTION = "MooseX::MarkAsMethods allows one to easily mark certain functions as Moose \
methods. This will allow other packages such as the namespace::autoclean \
manpage to operate without blowing away your overloads. After using \
MooseX::MarkAsMethods your overloads will be recognized by the Class::MOP \
manpage as being methods, and class extension as well as composition from \
roles with overloads will 'just work'. \
 \
By default we check for overloads, and mark those functions as methods. \
 \
If 'autoclean =&gt; 1' is passed to import on using this module, we will \
invoke namespace::autoclean to clear out non-methods."
LICENSE = "LGPL-2.1+"

PV = "0.15"

RPM_NAME = "perl-MooseX-MarkAsMethods-0.15-5.27.noarch.rpm"
RPM_HASH = "d40f1bfae8bc1126446bf00368dd28d22f231f9b75770c04adccd936fbb8b636db594a0447a0eaae9b4c6d09171857b5399fa47dee7a38a84f2272dfaa3e828a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MarkAsMethods \
perl-MooseX--MarkAsMethods--MetaRole--MethodMarker \
perl-MooseX-MarkAsMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Hooks--EndOfScope \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean"

inherit rpm
