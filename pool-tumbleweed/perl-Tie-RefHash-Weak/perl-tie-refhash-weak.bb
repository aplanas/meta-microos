SUMMARY = "A Tie::RefHash subclass with weakened references in the keys."
DESCRIPTION = "The the Tie::RefHash manpage module can be used to access hashes by \
reference. This is useful when you index by object, for example. \
 \
The problem with the Tie::RefHash manpage, and cross indexing, is that \
sometimes the index should not contain strong references to the objecs. the \
Tie::RefHash manpage's internal structures contain strong references to the \
key, and provide no convenient means to make those references weak. \
 \
This subclass of the Tie::RefHash manpage has weak keys, instead of strong \
ones. The values are left unaltered, and you'll have to make sure there are \
no strong references there yourself."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.09"

RPM_NAME = "perl-Tie-RefHash-Weak-0.09-1.25.noarch.rpm"
RPM_HASH = "be5b21382aa10ec022ac8ad5fd716a3a3ecfc0ff30f4bf73c187c1db500d70c4e7ac9d57688755b51cf36aa373a943c70ae00aa72a968cc46c594fd1558be28c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--RefHash--Weak \
perl-Tie-RefHash-Weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Task--Weaken \
perl-Variable--Magic"

inherit rpm
