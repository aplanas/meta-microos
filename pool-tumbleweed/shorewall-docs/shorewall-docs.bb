SUMMARY = "HTML documentation for shorewall configuration"
DESCRIPTION = "HTML documentation for the Shoreline Firewall. Highly recommend to read before \
starting to configure shorewall"
LICENSE = "GFDL-1.1-only"

PV = "5.2.8"

RPM_NAME = "shorewall-docs-5.2.8-4.2.noarch.rpm"
RPM_HASH = "246737de4bd5bc01f6aefe0da5c24fa53d4154f7895cf677c34e22033828770ea2511865a352585a440f5970addfe3325fe3c9b34911d3492714b96f82409113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-docs"
RDEPENDS:${PN} += ""

inherit rpm
