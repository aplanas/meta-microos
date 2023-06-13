SUMMARY = "Yum-utils CLI compatibility layer"
DESCRIPTION = "As a Yum-utils CLI compatibility layer, supplies in CLI shims for \
debuginfo-install, groups-manager, repograph, package-cleanup, repoclosure, \
repomanage, repoquery, reposync, repotrack, builddep, config-manager, debug, \
and download that use new implementations using DNF."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "yum-utils-4.3.1-2.1.noarch.rpm"
RPM_HASH = "8811670c825d79f4caa2bf16cd42fb5c712ab6f55b7b397acb8dfd559a2629d5e29a38ceba3a7450afa64eedd8d3cd2c41ca26a3a21ef79eac1d0e00c209113a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-utils \
yum-changelog \
yum-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
dnf \
dnf-plugins-core \
python3-dnf"

inherit rpm
