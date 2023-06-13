SUMMARY = "Load (and optionally decrypt via GnuPG) user/pass identity information"
DESCRIPTION = "Config::Identity is a tool for loading (and optionally decrypting via \
GnuPG) user/pass identity information \
 \
For GitHub API access, an identity is a 'login'/'token' pair \
 \
For PAUSE access, an identity is a 'user'/'password' pair"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0019"

RPM_NAME = "perl-Config-Identity-0.0019-1.10.noarch.rpm"
RPM_HASH = "8608b01bd5ed6d6f044eede1f6c8f082a9b67c352c2912cde0dc001e252ba889ea6cdf728f40b2574b54f7723b620c08aa6b14c19ba89a2fc4d2065ee70ab0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Config::Identity) \
perl(Config::Identity::GitHub) \
perl(Config::Identity::PAUSE) \
perl-Config-Identity"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::HomeDir) \
perl(File::Which) \
perl(IPC::Run)"

inherit rpm
