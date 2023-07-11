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
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-Data-Clone-0.004-4.30.aarch64.rpm"
RPM_HASH = "7bc7cf1ff0c1f9f167caa34402c8265852a63a989122469e1e094a5467b27c7018d31ef339606c573b6c2cf65a29e9b47d03f8b63bb983a386e3dd6c7871612c"

RPROVIDES:${PN} += "perl-Data--Clone \
perl-Data-Clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-parent"

inherit rpm
