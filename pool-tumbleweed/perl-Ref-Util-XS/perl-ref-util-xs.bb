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

RPM_NAME = "perl-Ref-Util-XS-0.117-1.17.aarch64.rpm"
RPM_HASH = "6078788eb6d7a693004dfd5e2eb20b6dbc6e671b553843a7c017b793d18f6ed897f8cb0ebd8e000ae746c097f83133701aa8f6b3dcf5b650782bf0bb76faa2f6"

RPROVIDES:${PN} += "perl-Ref--Util--XS \
perl-Ref-Util-XS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
