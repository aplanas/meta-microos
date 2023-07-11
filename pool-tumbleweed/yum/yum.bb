SUMMARY = "As a Yum CLI compatibility layer, supplies /usr/bin/yum redirecting to DNF"
DESCRIPTION = "As a Yum CLI compatibility layer, it supplies /usr/bin/yum redirecting to DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "yum-4.14.0-3.2.noarch.rpm"
RPM_HASH = "619b2e680d9623b77c1bdc29ee329dd3fe3032e07b96bc6e47172a2587dad1be7aa787399935007b8656b4330fa6f3da4790d6cbfab94d709c7ea924c24b9e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-yum \
dnf-yum \
yum \
yum-aliases \
yum-allowdowngrade \
yum-basearchonly \
yum-downloadonly \
yum-fastestmirror \
yum-priorities \
yum-protect-packages \
yum-protectbase \
yum-refresh-updatesd \
yum-tsflags"

RDEPENDS:${PN} += "dnf"

inherit rpm
