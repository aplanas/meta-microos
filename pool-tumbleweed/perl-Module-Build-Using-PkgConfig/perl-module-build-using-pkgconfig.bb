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

RPM_NAME = "perl-Module-Build-Using-PkgConfig-0.03-1.13.noarch.rpm"
RPM_HASH = "ddedb43a73b7e4f37add04ae33b20df56d329ca958954c34b2cc54194f7ffc51702a5a34fd7ebfdae497e61c1ba26642c767dedac0d8be641e6bb2c779d4f31e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Using--PkgConfig \
perl-Module-Build-Using-PkgConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--PkgConfig \
perl-Module--Build"

inherit rpm
