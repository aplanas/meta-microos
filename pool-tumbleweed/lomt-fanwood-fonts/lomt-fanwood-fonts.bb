SUMMARY = "League Of Movable Type's 'Fanwood' font family"
DESCRIPTION = "This serif font is based on work of a famous Czech-American type \
designer of yesteryear. The package includes roman and italic."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-fanwood-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "7ae53b731cebe5cf359e8a28b52ba34b2b53fe96d25569f796650f9240534c2dcd551a3860eb788f9d83ec5c89364a0cb83095e682ca5817453e5998bbf3b776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-fanwood-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
