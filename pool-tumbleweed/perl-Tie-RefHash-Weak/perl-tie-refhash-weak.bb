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

RPM_NAME = "perl-Tie-RefHash-Weak-0.09-1.26.noarch.rpm"
RPM_HASH = "711dddd9507b16cf93bbe6af1cf4bd714d23c912a4f3564fc1fb854b99d791f5b2bf4dfcb3dd0e6875152a48a640024cb55f4da5261867bd608f518cc3daa628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--RefHash--Weak \
perl-Tie-RefHash-Weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Task--Weaken \
perl-Variable--Magic"

inherit rpm
