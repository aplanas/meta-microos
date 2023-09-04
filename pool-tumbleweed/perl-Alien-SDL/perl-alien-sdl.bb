SUMMARY = "Building, Finding and Using Sdl Binaries"
DESCRIPTION = "Please see the Alien manpage for the manifesto of the Alien namespace. \
 \
In short 'Alien::SDL' can be used to detect and get configuration settings \
from an installed SDL and related libraries. Based on your platform it \
offers the possibility to download and install prebuilt binaries or to \
build SDL & co. from source codes. \
 \
The important facts: \
 \
* * The module does not modify in any way the already existing SDL \
  installation on your system. \
 \
* * If you reinstall SDL libs on your system you do not need to \
  reinstall Alien::SDL (providing that you use the same directory for \
  the new installation). \
 \
* * The prebuild binaries and/or binaries built from sources are always \
  installed into perl module's 'share' directory. \
 \
* * If you use prebuild binaries and/or binaries built from sources \
  it happens that some of the dynamic libraries (*.so, *.dll) will not \
  automaticly loadable as they will be stored somewhere under perl module's \
  'share' directory. To handle this scenario Alien::SDL offers some special \
  functionality (see below)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.446"

RPM_NAME = "perl-Alien-SDL-1.446-4.13.aarch64.rpm"
RPM_HASH = "567040dd8be7e8de675e86df6243a37065f51a52ddabcb08f4a6ee48d75d2588e028fffa0211c03671775fc4437091f6e3d81e9ac23ed47a2a1788daee690157"

RPROVIDES:${PN} += "perl-Alien--SDL \
perl-Alien--SDL--ConfigData \
perl-Alien-SDL"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-ExtUtils--CBuilder \
perl-File--ShareDir \
perl-File--Which"

inherit rpm
