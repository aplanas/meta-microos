SUMMARY = "Alien::Build plugin to download from GitLab"
DESCRIPTION = "This plugin is designed for downloading assets from a GitLab instance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Alien-Build-Plugin-Download-GitLab-0.01-1.3.noarch.rpm"
RPM_HASH = "07f81b09e344404907ae66622e548b8990d62f02e5597ab61080d4bb35ac92b687f7464bf143864d4c681e5067c6590ed346fb6d45d04462879f01ad8f982067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Alien--Build--Plugin--Download--GitLab \
perl-Alien-Build-Plugin-Download-GitLab"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Alien--Build--Plugin \
perl-JSON--PP \
perl-Path--Tiny \
perl-URI \
perl-URI--Escape"

inherit rpm
