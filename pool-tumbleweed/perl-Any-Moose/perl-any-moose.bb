SUMMARY = "(DEPRECATED) use Moo instead!"
DESCRIPTION = "(DEPRECATED) use Moo instead!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-Any-Moose-0.27-1.24.noarch.rpm"
RPM_HASH = "16926a2a6e3ac226b77b1f140a34f407ceb9367be68e6c9d6533ebb2046624ce313a15b6707c57ea3436e67bf2e22f65558506fa5c136f2079016d7d65cc2c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Any--Moose \
perl-Any-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
