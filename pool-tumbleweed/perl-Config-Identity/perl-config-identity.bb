SUMMARY = "Load (and optionally decrypt via GnuPG) user/pass identity information"
DESCRIPTION = "Config::Identity is a tool for loading (and optionally decrypting via \
GnuPG) user/pass identity information \
 \
For GitHub API access, an identity is a 'login'/'token' pair \
 \
For PAUSE access, an identity is a 'user'/'password' pair"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0019"

RPM_NAME = "perl-Config-Identity-0.0019-1.11.noarch.rpm"
RPM_HASH = "cfa959fb2e8c2ebf33d17fef980cf74e799dd655510f180fcd2b32af9b0d9b303a4baf964ef0fcb6f6c9ffef71fe60a2e255dcb7236e4505aeba97002958a82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Identity \
perl-Config--Identity--GitHub \
perl-Config--Identity--PAUSE \
perl-Config-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--HomeDir \
perl-File--Which \
perl-IPC--Run"

inherit rpm
