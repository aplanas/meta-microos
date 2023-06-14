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

RPM_NAME = "perl-experimental-0.031-1.1.noarch.rpm"
RPM_HASH = "acc5aee0f28c43b95e39b64baa56b0c2161d6140a48c2378ec2699741a3e635803d8da70b74c069e540d6f8a73b9c70ec0211b1a92b96dc8dd81098a6554dd71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-experimental \
perl-stable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-version"

inherit rpm
