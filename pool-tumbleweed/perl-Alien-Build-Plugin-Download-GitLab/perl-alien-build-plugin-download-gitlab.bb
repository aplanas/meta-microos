SUMMARY = "Alien::Build plugin to download from GitLab"
DESCRIPTION = "This plugin is designed for downloading assets from a GitLab instance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Alien-Build-Plugin-Download-GitLab-0.01-1.2.noarch.rpm"
RPM_HASH = "5b5bd9bb2230df27437e22c03100cc5d41d76987cd946534437cad0c6edf1d33312102a41c7acd4a02e6056985df0419fdeb22df31b169b1257c7b083c87b401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Alien::Build::Plugin::Download::GitLab) \
perl-Alien-Build-Plugin-Download-GitLab"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Alien::Build::Plugin) \
perl(JSON::PP) \
perl(Path::Tiny) \
perl(URI) \
perl(URI::Escape)"

inherit rpm
