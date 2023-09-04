SUMMARY = "Polymorphic data cloning"
DESCRIPTION = "'Data::Clone' does data cloning, i.e. copies things recursively. This is \
smart so that it works with not only non-blessed references, but also with \
blessed references (i.e. objects). When 'clone()' finds an object, it calls \
a 'clone' method of the object if the object has a 'clone', otherwise it \
makes a surface copy of the object. That is, this module does polymorphic \
data cloning. \
 \
Although there are several modules on CPAN which can clone data, this \
module has a different cloning policy from almost all of them. See Cloning \
policy and Comparison to other cloning modules for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.004"

RPM_NAME = "perl-Data-Clone-0.004-5.1.aarch64.rpm"
RPM_HASH = "5dc983f9fd655836436159b094c53153be0757d57b12e4348f069f4b8abb83bdb9fd619831cdb43b4ea5fe8f005f6cf2bc0609f397170b111043921285d5c344"

RPROVIDES:${PN} += "perl-Data--Clone \
perl-Data-Clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
