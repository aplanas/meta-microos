SUMMARY = "Alien::Build plugin to download from GitLab"
DESCRIPTION = "This plugin is designed for downloading assets from a GitLab instance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Alien-Build-Plugin-Download-GitLab-0.01-1.4.noarch.rpm"
RPM_HASH = "c803e2fc6eb83f2ba55c133b15c9706a629fc4ed10eb5d6281ec2b8c7e58e570d89fd1931bf5eb96be42e2781a69a00e00724a1eb1921594bd933dd5a844726c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Alien--Build--Plugin--Download--GitLab \
perl-Alien-Build-Plugin-Download-GitLab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Alien--Build--Plugin \
perl-JSON--PP \
perl-Path--Tiny \
perl-URI \
perl-URI--Escape"

inherit rpm
