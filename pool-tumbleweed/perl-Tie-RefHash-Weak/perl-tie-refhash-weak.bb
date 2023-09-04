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

RPM_NAME = "perl-Tie-RefHash-Weak-0.09-1.27.noarch.rpm"
RPM_HASH = "85d38f45730dd8acbeeace90ab2c08d2e84d2624792d4886b6b0b5582a7a3cab4e0476622ff17182a8839eed69de5700627008fde40d3133732441292e2c499d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--RefHash--Weak \
perl-Tie-RefHash-Weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Task--Weaken \
perl-Variable--Magic"

inherit rpm
