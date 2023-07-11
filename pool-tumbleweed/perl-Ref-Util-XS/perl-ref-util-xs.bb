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

RPM_NAME = "perl-Ref-Util-XS-0.117-1.16.aarch64.rpm"
RPM_HASH = "0ee6addf84acccf8a810866a57b38d8f577ff71da3bdbb7a63dee5776fbf56b18e5e4468a72bfa2b2e54db7fb422c6bb1fee4f7237a512304a0d5985c820f04f"

RPROVIDES:${PN} += "perl-Ref--Util--XS \
perl-Ref-Util-XS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
