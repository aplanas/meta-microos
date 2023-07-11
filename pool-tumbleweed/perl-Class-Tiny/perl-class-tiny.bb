SUMMARY = "Minimalist class construction"
DESCRIPTION = "This module offers a minimalist class construction kit in around 120 lines \
of code. Here is a list of features: \
 \
  * defines attributes via import arguments \
 \
  * generates read-write accessors \
 \
  * supports lazy attribute defaults \
 \
  * supports custom accessors \
 \
  * superclass provides a standard 'new' constructor \
 \
  * 'new' takes a hash reference or list of key/value pairs \
 \
  * 'new' supports providing 'BUILDARGS' to customize constructor options \
 \
  * 'new' calls 'BUILD' for each class from parent to child \
 \
  * superclass provides a 'DESTROY' method \
 \
  * 'DESTROY' calls 'DEMOLISH' for each class from child to parent \
 \
Multiple-inheritance is possible, with superclass order determined via \
mro::get_linear_isa. \
 \
It uses no non-core modules for any recent Perl. On Perls older than v5.10 \
it requires MRO::Compat. On Perls older than v5.14, it requires \
Devel::GlobalDestruction."
LICENSE = "Apache-2.0"

PV = "1.008"

RPM_NAME = "perl-Class-Tiny-1.008-1.13.noarch.rpm"
RPM_HASH = "bbdebe2d6a7146b339ee0a63dfb0ea71d71df3af743dab1a86cd10457b2b7b383ba2f5191127f6755653a574dd349b11a47ba1959918b1618f32a50ffda11f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Tiny \
perl-Class--Tiny--Object \
perl-Class-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
