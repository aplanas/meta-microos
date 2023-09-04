SUMMARY = "Colorizes text using ANSI colors"
DESCRIPTION = "colorizes text using ANSI colors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0.3"

RPM_NAME = "perl-Template-Plugin-Filter-ANSIColor-0.0.3-1.13.noarch.rpm"
RPM_HASH = "0eac3ebd9e862be49ce59aba29b7d46d78657453275586b2a2c196394e48d65262cf0dffa03170e0640a5a13fd88e87978ab5a51c075976a438e85f58010af59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--Filter--ANSIColor \
perl-Template-Plugin-Filter-ANSIColor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Template \
perl-Term--ANSIColor \
perl-Term--Terminfo"

inherit rpm
