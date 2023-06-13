SUMMARY = "Camelcase, de-Camelcase"
DESCRIPTION = "camelcase, de-camelcase"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-String-CamelCase-0.04-1.18.noarch.rpm"
RPM_HASH = "2112a6c35245927a3f08dd6399257d61307d8f2112a96c8015cf827347cab7d09936cf254aa0ab40bd696103e386f61999df6aaa02e83a96b67021d8d5ea2508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::CamelCase) \
perl-String-CamelCase"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
