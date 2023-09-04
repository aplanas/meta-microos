SUMMARY = "Fast parsing of the Linux desktop files"
DESCRIPTION = "The 'Linux::DesktopFiles', a very fast and simple way to parse the Linux \
desktop files."
LICENSE = "Artistic-2.0"

PV = "0.25"

RPM_NAME = "perl-Linux-DesktopFiles-0.25-1.21.noarch.rpm"
RPM_HASH = "fe76ecb7bb6044d3328b52614c85e09d8ff5898f909164276000df821ca992a079abbfcd8dd991b063bb672bbb510657c41b85464e8c90df0e0b6d2524bb8e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Linux--DesktopFiles \
perl-Linux-DesktopFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
