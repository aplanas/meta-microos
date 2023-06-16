SUMMARY = "Server for git directory version tracker"
DESCRIPTION = "Gitolite is an access control layer on top of git, which allows access control \
down to the branch level, including specifying who can and cannot rewind a given \
branch."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.12"

RPM_NAME = "gitolite-3.6.12-2.3.noarch.rpm"
RPM_HASH = "f66c7060b390bd837746ea95dc1967a007d6c2bf19dff483281991b3efe4ba06df49c9747c954567490c20c61d3c60ff1d88bc49943f9f12b1ea512950177ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-gitolite \
gitolite \
perl-Gitolite--Cache \
perl-Gitolite--Common \
perl-Gitolite--Conf \
perl-Gitolite--Conf--Explode \
perl-Gitolite--Conf--Load \
perl-Gitolite--Conf--Store \
perl-Gitolite--Conf--Sugar \
perl-Gitolite--Easy \
perl-Gitolite--Hooks--PostUpdate \
perl-Gitolite--Hooks--Update \
perl-Gitolite--Rc \
perl-Gitolite--Setup \
perl-Gitolite--Test \
perl-Gitolite--Triggers \
perl-Gitolite--Triggers--Alias \
perl-Gitolite--Triggers--AutoCreate \
perl-Gitolite--Triggers--CpuTime \
perl-Gitolite--Triggers--Kindergarten \
perl-Gitolite--Triggers--Mirroring \
perl-Gitolite--Triggers--Motd \
perl-Gitolite--Triggers--RefexExpr \
perl-Gitolite--Triggers--RepoUmask \
perl-Gitolite--Triggers--Shell \
perl-Gitolite--Triggers--TProxy \
perl-Gitolite--Triggers--Writable \
perl-SugarBox \
perl-Tsh"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
git \
perl--MODULE-COMPAT-5.36.0 \
user-nginx \
user-wwwrun"

inherit rpm
