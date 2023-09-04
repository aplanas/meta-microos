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

RPM_NAME = "perl-MooseX-Singleton-0.30-1.24.noarch.rpm"
RPM_HASH = "39fb318509824d421ce555203923f3ed9559ad7a81fd787712040ea84b59b06684dd54ccc33f7f6f343178edf17d3618b0d4ebe400f476c581bb83087c1a8a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Singleton \
perl-MooseX--Singleton--Role--Meta--Class \
perl-MooseX--Singleton--Role--Meta--Instance \
perl-MooseX--Singleton--Role--Meta--Method--Constructor \
perl-MooseX--Singleton--Role--Object \
perl-MooseX-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role"

inherit rpm
