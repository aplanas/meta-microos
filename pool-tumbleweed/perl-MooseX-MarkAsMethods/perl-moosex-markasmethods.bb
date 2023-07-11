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

RPM_NAME = "perl-MooseX-MarkAsMethods-0.15-5.26.noarch.rpm"
RPM_HASH = "3355bc9aa80d2ac3bcd2b08e7a9ac2f640222e5067de3aef0b41321e3856e2d56774f6d887c1140a11f654cc36403b3cee41e3c91b9ae50302882a544c0d361a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MarkAsMethods \
perl-MooseX--MarkAsMethods--MetaRole--MethodMarker \
perl-MooseX-MarkAsMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--EndOfScope \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean"

inherit rpm
