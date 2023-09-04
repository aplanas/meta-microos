SUMMARY = "Server for git directory version tracker"
DESCRIPTION = "Gitolite is an access control layer on top of git, which allows access control \
down to the branch level, including specifying who can and cannot rewind a given \
branch."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.13"

RPM_NAME = "gitolite-3.6.13-1.2.noarch.rpm"
RPM_HASH = "aefc3edd43896617588b17abd2965cdeff332ccead9f86946e01a1b4479d1ba9a92795903f727aae407b990f7948c8224c64d45b83271cfe6029f2afd5000171"
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
perl--MODULE-COMPAT-5.38.0 \
user-nginx \
user-wwwrun"

inherit rpm
