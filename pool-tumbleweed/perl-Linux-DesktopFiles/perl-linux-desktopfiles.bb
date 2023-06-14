SUMMARY = "Fast parsing of the Linux desktop files"
DESCRIPTION = "The 'Linux::DesktopFiles', a very fast and simple way to parse the Linux \
desktop files."
LICENSE = "Artistic-2.0"

PV = "0.25"

RPM_NAME = "perl-Linux-DesktopFiles-0.25-1.19.noarch.rpm"
RPM_HASH = "a9ad14c6e65bc8a24fdc5cb690f708cd272e64bc86e22710c2cbe6f4e294c15ec1c05d8e0dc903112ee312baa35904b263d02a96ab89782b2812638cb7dda2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Linux--DesktopFiles \
perl-Linux-DesktopFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
