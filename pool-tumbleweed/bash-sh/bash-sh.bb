SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use bash as /bin/sh implementation."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-sh-5.2.15-8.6.noarch.rpm"
RPM_HASH = "c4039eaabfd036a210abcca51a8194b7683a40ebf0acaa679e5276fed004b1d9eec5ca24826d7ec4fdc1f8826591c71c81c3f76dba169905d383d8dfe1872d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
bash-sh"

RDEPENDS:${PN} += "bash"

inherit rpm
