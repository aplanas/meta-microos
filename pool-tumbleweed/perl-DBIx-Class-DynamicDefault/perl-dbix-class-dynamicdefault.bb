SUMMARY = "Automatically set and update fields"
DESCRIPTION = "Automatically set and update fields with values calculated at runtime."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-DBIx-Class-DynamicDefault-0.04-2.21.noarch.rpm"
RPM_HASH = "75086ac9accd34eed9da33c986abfb832c9b18354c26df8c43c3ac6b5390a873550efb3fdfec94618fa96f8bc83932e14eac734e59aa82760d89cc014f9e2426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--DynamicDefault \
perl-DBIx-Class-DynamicDefault"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBIx--Class"

inherit rpm
