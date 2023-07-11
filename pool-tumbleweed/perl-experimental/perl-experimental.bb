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

RPM_NAME = "perl-experimental-0.031-1.2.noarch.rpm"
RPM_HASH = "abb56711ab45b35a8b99262ada9e2e1c6c5ce627a5ab58084e267f9c33549d5b6f5e0594c1f60f0aff82105b934785346414c722770a00bb20e8c947412cc7f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-experimental \
perl-stable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-version"

inherit rpm
