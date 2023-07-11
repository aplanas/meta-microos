SUMMARY = "Extend Module::Build to more easily use platform libraries provided by pkg-config"
DESCRIPTION = "This subclass of Module::Build provides some handy methods to assist the \
_Build.PL_ script of XS-based module distributions that make use of \
platform libraries managed by _pkg-config_. \
 \
As well as supporting libraries installed on a platform-wide basis and thus \
visible to _pkg-config_ itself, this subclass also assists with \
'Alien::'-based wrappers of these system libraries, allowing them to be \
dynamically installed at build time if the platform does not provide them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Module-Build-Using-PkgConfig-0.03-1.12.noarch.rpm"
RPM_HASH = "58234006f9aa2405a21e4ae804af7d0f1c2082416a6feef40054c3c9289db1094b938504c183bc9bd6d9da813a958008ce0bb558a8176ddd33a001976870e381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Using--PkgConfig \
perl-Module-Build-Using-PkgConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--PkgConfig \
perl-Module--Build"

inherit rpm
