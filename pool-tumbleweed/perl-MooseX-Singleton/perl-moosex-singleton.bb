SUMMARY = "Turn your Moose class into a singleton"
DESCRIPTION = "A singleton is a class that has only one instance in an application. \
'MooseX::Singleton' lets you easily upgrade (or downgrade, as it were) your \
Moose class to a singleton. \
 \
All you should need to do to transform your class is to change 'use Moose' \
to 'use MooseX::Singleton'. This module uses metaclass roles to do its \
magic, so it should cooperate with most other 'MooseX' modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.30"

RPM_NAME = "perl-MooseX-Singleton-0.30-1.23.noarch.rpm"
RPM_HASH = "524d932504b59f81e045a8d2f43235d84f098a7972a48b28ef59aad70a27ee2fbc72a3511d751d6ad6d4e3f2a9ac42abf43aeb5954a57339f410a41aaf8cb15a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Singleton \
perl-MooseX--Singleton--Role--Meta--Class \
perl-MooseX--Singleton--Role--Meta--Instance \
perl-MooseX--Singleton--Role--Meta--Method--Constructor \
perl-MooseX--Singleton--Role--Object \
perl-MooseX-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role"

inherit rpm
