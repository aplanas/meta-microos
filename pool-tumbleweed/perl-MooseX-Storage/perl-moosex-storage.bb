SUMMARY = "Serialization framework for Moose classes"
DESCRIPTION = "MooseX::Storage is a serialization framework for Moose, it provides a very \
flexible and highly pluggable way to serialize Moose classes to a number of \
different formats and styles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.53"

RPM_NAME = "perl-MooseX-Storage-0.53-1.15.noarch.rpm"
RPM_HASH = "3419afc65a71c2b47e6e87b3d7a9848419f1e08c7cba2c68cabddab66a5dd149a2f9456d6d858742bd532caea980bd45a754aad46eaa95a6ac7eae194bbd4000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Storage \
perl-MooseX--Storage--Base--WithChecksum \
perl-MooseX--Storage--Basic \
perl-MooseX--Storage--Deferred \
perl-MooseX--Storage--Engine \
perl-MooseX--Storage--Engine--IO--AtomicFile \
perl-MooseX--Storage--Engine--IO--File \
perl-MooseX--Storage--Engine--Trait--DisableCycleDetection \
perl-MooseX--Storage--Engine--Trait--OnlyWhenBuilt \
perl-MooseX--Storage--Format--JSON \
perl-MooseX--Storage--Format--Storable \
perl-MooseX--Storage--Format--YAML \
perl-MooseX--Storage--IO--AtomicFile \
perl-MooseX--Storage--IO--File \
perl-MooseX--Storage--IO--StorableFile \
perl-MooseX--Storage--Meta--Attribute--DoNotSerialize \
perl-MooseX--Storage--Meta--Attribute--Trait--DoNotSerialize \
perl-MooseX--Storage--Traits--DisableCycleDetection \
perl-MooseX--Storage--Traits--OnlyWhenBuilt \
perl-MooseX--Storage--Util \
perl-MooseX-Storage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--AtomicFile \
perl-JSON--MaybeXS \
perl-Module--Runtime \
perl-Moose \
perl-Moose--Meta--Attribute \
perl-Moose--Role \
perl-String--RewritePrefix \
perl-YAML--Any \
perl-namespace--autoclean"

inherit rpm
