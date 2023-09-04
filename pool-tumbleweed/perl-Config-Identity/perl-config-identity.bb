SUMMARY = "Load (and optionally decrypt via GnuPG) user/pass identity information"
DESCRIPTION = "Config::Identity is a tool for loading (and optionally decrypting via \
GnuPG) user/pass identity information \
 \
For GitHub API access, an identity is a 'login'/'token' pair \
 \
For PAUSE access, an identity is a 'user'/'password' pair"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0019"

RPM_NAME = "perl-Config-Identity-0.0019-1.12.noarch.rpm"
RPM_HASH = "872eb655dbb5f8c7043b1c0f2b12063ed745910df5de6e31a160fa99660bab0ea54534d37fb04466b0c15f57155d248ca86d59585c17bdcfadee9513508a02fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Identity \
perl-Config--Identity--GitHub \
perl-Config--Identity--PAUSE \
perl-Config-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--HomeDir \
perl-File--Which \
perl-IPC--Run"

inherit rpm
