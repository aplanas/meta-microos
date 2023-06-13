SUMMARY = "Localhost-only version of NPM registry"
DESCRIPTION = "localhost-only npm registry serves NPM packages on localhost \
address allowing running of 'npm install' in a non-networked \
environment"
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "local-npm-registry-0.0.3-1.6.noarch.rpm"
RPM_HASH = "a4ae89a5d862de1b77d2aaeb0a693ac2a22ecac3b35668ef3ba52ea9603d4d8071b5b1199f27ac89c9cbe7f35396100367c439802358a49fc183572e8137c8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "local-npm-registry"

RDEPENDS:${PN} += "npm-default"

inherit rpm
