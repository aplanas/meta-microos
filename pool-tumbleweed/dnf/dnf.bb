SUMMARY = "Package manager forked from Yum, using libsolv as a dependency resolver"
DESCRIPTION = "DNF is a package manager for RPM systems that was forked from Yum. Among the \
many improvements, it uses libsolv as a dependency resolver."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-4.14.0-3.2.noarch.rpm"
RPM_HASH = "47fc9f2535e0c1717ce7fcee67f0ca4208fddf081375721f897236043246ca6128f3a8c8b683c1d7291b0ad3ac794d55a9c7345950052018c3fab7021aa208b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf \
dnf-command-autoremove \
dnf-command-check-update \
dnf-command-clean \
dnf-command-distro-sync \
dnf-command-downgrade \
dnf-command-group \
dnf-command-history \
dnf-command-info \
dnf-command-install \
dnf-command-list \
dnf-command-makecache \
dnf-command-mark \
dnf-command-provides \
dnf-command-reinstall \
dnf-command-remove \
dnf-command-repolist \
dnf-command-repoquery \
dnf-command-repository-packages \
dnf-command-search \
dnf-command-updateinfo \
dnf-command-upgrade \
dnf-command-upgrade-to"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-dnf"

inherit rpm
