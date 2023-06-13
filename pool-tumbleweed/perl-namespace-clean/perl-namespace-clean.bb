SUMMARY = "Keep imports and functions out of your namespace"
DESCRIPTION = "Keep imports and functions out of your namespace"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-namespace-clean-0.27-1.24.noarch.rpm"
RPM_HASH = "d9ab1dff8bed303ebf8eb476807bb30f9181722eee023966370fc6b40b0f5e39d21ba45f0c100b805e143f3074d991047f550b508eaeb593e12bf5669dc97774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(namespace::clean) \
perl-namespace-clean"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(B::Hooks::EndOfScope) \
perl(Package::Stash)"

inherit rpm
