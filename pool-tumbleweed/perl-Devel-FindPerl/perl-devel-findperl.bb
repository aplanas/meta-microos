SUMMARY = "Find the path to your perl"
DESCRIPTION = "This module tries to find the path to the currently running perl. It \
(optionally) exports the following functions:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Devel-FindPerl-0.016-1.4.noarch.rpm"
RPM_HASH = "f2e4352808289d7040830a80ca938a7b84f96f29f01da869c09b80038ea3dcb4b3521f4ec80179247c638735a5ae4fe6f46a7cdf1d484cb0ec92deb9c8f1698c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::FindPerl) \
perl-Devel-FindPerl"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
