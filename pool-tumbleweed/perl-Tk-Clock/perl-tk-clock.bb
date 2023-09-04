SUMMARY = "Clock widget with analog and digital display"
DESCRIPTION = "This module implements a Canvas-based clock widget for perl-Tk with lots of \
options to change the appearance. \
 \
Both analog and digital clocks are implemented."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-Tk-Clock-0.44-1.3.noarch.rpm"
RPM_HASH = "cc773fc6239caaf87ff4c0d8799b7951ea6811cf9800dae9a3f592ba6069d64e9d52b185742e795a401f22350be2fe3f255c94de5208d8faac11d608ac1c0b17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tk--Clock \
perl-Tk-Clock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--More \
perl-Test--NoWarnings \
perl-Tk \
perl-Tk--Canvas \
perl-Tk--Derived \
perl-Tk--Widget"

inherit rpm
