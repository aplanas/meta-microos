SUMMARY = "Experimental features made easy"
DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features. \
 \
Every version of perl has some number of features present but considered \
'experimental.' For much of the life of Perl 5, this was only a designation \
found in the documentation. Starting in Perl v5.10.0, and more aggressively \
in v5.18.0, experimental features were placed behind pragmata used to \
enable the feature and disable associated warnings. \
 \
The 'experimental' pragma exists to combine the required incantations into \
a single interface stable across releases of perl. For every experimental \
feature, this should enable the feature and silence warnings for the \
enclosing lexical scope: \
 \
  use experimental 'feature-name';"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.031"

RPM_NAME = "perl-experimental-0.031-1.3.noarch.rpm"
RPM_HASH = "db0f3fb58fc8172dc42b0bc3dfdaefe45213f11cf3592694529493361be4f91964c4346ddf56ef57e10d058d7b24202e209761b1a88d559d2f2d761bbfa83f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-experimental \
perl-stable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-version"

inherit rpm
