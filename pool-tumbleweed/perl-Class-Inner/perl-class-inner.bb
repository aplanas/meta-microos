SUMMARY = "A perlish implementation of Java like inner classes"
DESCRIPTION = "Yet another implementation of an anonymous class with per object \
overrideable methods, but with the added attraction of sort of working \
dispatch to the parent class's method."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.200001"

RPM_NAME = "perl-Class-Inner-0.200001-13.27.noarch.rpm"
RPM_HASH = "54b6dbe86988dfe82349e6325ecd52724667eae897a5813bf00764c82ccbfe101e0b4fb9e57bc37f8751570bcd86cf1b077d99ccfdcd296cae6337fca853fb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inner \
perl-Class-Inner"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
