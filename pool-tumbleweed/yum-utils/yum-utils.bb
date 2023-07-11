SUMMARY = "Yum-utils CLI compatibility layer"
DESCRIPTION = "As a Yum-utils CLI compatibility layer, supplies in CLI shims for \
debuginfo-install, groups-manager, repograph, package-cleanup, repoclosure, \
repomanage, repoquery, reposync, repotrack, builddep, config-manager, debug, \
and download that use new implementations using DNF."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "yum-utils-4.3.1-2.2.noarch.rpm"
RPM_HASH = "7adab0ebb3c7e389884d746dfe1b1acf53c4451ecf7562cacd9b35b90f9a52be7fb23627b6210113c22ba46e1a260bd2c763cf22fea11020d426436a33126de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-utils \
yum-changelog \
yum-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
dnf \
dnf-plugins-core \
python3-dnf"

inherit rpm
