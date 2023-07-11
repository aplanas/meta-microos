SUMMARY = "HTML documentation for shorewall configuration"
DESCRIPTION = "HTML documentation for the Shoreline Firewall. Highly recommend to read before \
starting to configure shorewall"
LICENSE = "GFDL-1.1-only"

PV = "5.2.8"

RPM_NAME = "shorewall-docs-5.2.8-5.1.noarch.rpm"
RPM_HASH = "1d94b7d381ef81efdf8756a8ecc2a8938db72c0d1166b999dc1ad0bca5cbb7637e58146ae2b93c6688e407925de8aa286e1a0e11213243e1a718593fd262fb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-docs"

RDEPENDS:${PN} += ""

inherit rpm
