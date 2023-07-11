SUMMARY = "Change and print terminal line settings"
DESCRIPTION = "This is the PERL POSIX compliant stty."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-IO-Stty-0.04-1.14.noarch.rpm"
RPM_HASH = "9209461a432e9cb92052385edfa89f0ff02de63686dd194ecbc145af56c51dcdf07890eea2ece8d9c9fb2416c84207d5bbd531b2c005eb55af6a5dc0d370e9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Stty \
perl-IO-Stty"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
