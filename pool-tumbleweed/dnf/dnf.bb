SUMMARY = "Package manager forked from Yum, using libsolv as a dependency resolver"
DESCRIPTION = "DNF is a package manager for RPM systems that was forked from Yum. Among the \
many improvements, it uses libsolv as a dependency resolver."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-4.14.0-3.1.noarch.rpm"
RPM_HASH = "6e3afd0c1ae4485a57d8bcbff8540a3d9cbcbbdfd34a1453814f38cfd01cdaf60ba38ca4fe65b90f1b076e069076c57778ea7d40bb2b085e0380c9acf1788bbc"
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
