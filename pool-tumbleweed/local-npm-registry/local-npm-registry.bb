SUMMARY = "Localhost-only version of NPM registry"
DESCRIPTION = "localhost-only npm registry serves NPM packages on localhost \
address allowing running of 'npm install' in a non-networked \
environment"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "local-npm-registry-1.0.1-1.1.noarch.rpm"
RPM_HASH = "cf4e479526b9e69aac43aeb7ebb8883ad5c1385170ff8c49fd48c0f94cc2dfaac54ce2ce5f9a5df50db7763f9740f2a96ce2b61808ca6449b609d801cedaaf29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "local-npm-registry"

RDEPENDS:${PN} += "npm-default"

inherit rpm
