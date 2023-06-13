SUMMARY = "XS implementation for Ref::Util"
DESCRIPTION = "Ref::Util::XS is the XS implementation of Ref::Util, which provides several \
functions to help identify references in a more convenient way than the \
usual approach of examining the return value of 'ref'. \
 \
You should use Ref::Util::XS by installing Ref::Util itself: if the system \
you install it on has a C compiler available, 'Ref::Util::XS' will be \
installed and used automatically, providing a significant speed boost to \
everything that uses 'Ref::Util'. \
 \
See Ref::Util for full documentation of the available functions."
LICENSE = "MIT"

PV = "0.117"

RPM_NAME = "perl-Ref-Util-XS-0.117-1.15.aarch64.rpm"
RPM_HASH = "cd2ccbc2037a45f15771ffaf3fcccb4fc4f272ddf09ba29384484f78454ceff2d1a22f514d70cf185230b4a53315e3b6fd3b11d080b0ae275e8749496b27e9cc"

RPROVIDES:${PN} += "perl(Ref::Util::XS) \
perl-Ref-Util-XS \
perl-Ref-Util-XS(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
