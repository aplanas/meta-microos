SUMMARY = "Fast parsing of the Linux desktop files"
DESCRIPTION = "The 'Linux::DesktopFiles', a very fast and simple way to parse the Linux \
desktop files."
LICENSE = "Artistic-2.0"

PV = "0.25"

RPM_NAME = "perl-Linux-DesktopFiles-0.25-1.20.noarch.rpm"
RPM_HASH = "b6a8ba6cfbc5f57c3edc94ef36fa561d4d8ae15bfc7098849dc67da2f27b63435b1088fec019127cf488c03f3d285f3141a57c5be753d78d440e1bc80aaf1755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Linux--DesktopFiles \
perl-Linux-DesktopFiles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
