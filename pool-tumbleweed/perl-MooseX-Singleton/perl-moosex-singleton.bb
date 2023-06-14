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

RPM_NAME = "perl-MooseX-Singleton-0.30-1.22.noarch.rpm"
RPM_HASH = "c9feacab97c0182deef24ae65670d4f9428145c13e1fba8de381bf6a5fab48a5569e4d4bc2f2bd6ab5b472bb117695306bf2e45ff1b05b236cd95a5bb0a87ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Singleton \
perl-MooseX--Singleton--Role--Meta--Class \
perl-MooseX--Singleton--Role--Meta--Instance \
perl-MooseX--Singleton--Role--Meta--Method--Constructor \
perl-MooseX--Singleton--Role--Object \
perl-MooseX-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role"

inherit rpm
