SUMMARY = "Compute `intelligent' differences between two files / lists"
DESCRIPTION = "Compute `intelligent' differences between two files / lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.201"

RPM_NAME = "perl-Algorithm-Diff-1.201-1.11.noarch.rpm"
RPM_HASH = "9fc2d8503e8eb396e79e54f19e2ec0596b23a175fd5a07b0728566f2911a214b0f74bdf8906b8eb7bf0391b08f3724066f0a2a2790ded21d97b707c389464559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Algorithm::Diff) \
perl(Algorithm::Diff::_impl) \
perl-Algorithm-Diff"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
