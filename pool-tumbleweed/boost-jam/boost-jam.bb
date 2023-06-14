SUMMARY = "A Boost Make Replacement"
DESCRIPTION = "Boost Jam is a build tool based on FTJam, which in turn is based on \
Perforce Jam. It contains significant improvements made to facilitate \
its use in the Boost Build System. \
 \
This package installs the default version of Boost Jam."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "boost-jam-1.82.0-1.1.noarch.rpm"
RPM_HASH = "8691746847efe14c53bcd2447fac3772ae2a00d37cc4f5261b1e14990d5ca29664b62619ed6a6c25f9c4ed621c87eb55ef8c81a767d8bf3ac5021575202dbbc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-jam"

RDEPENDS:${PN} += "boost1-82-0-jam"

inherit rpm
