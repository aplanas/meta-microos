SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.14.15"

RPM_NAME = "go1.14-doc-1.14.15-1.14.aarch64.rpm"
RPM_HASH = "e4bfc5bf8f29ee100e37851fa83ef8330e05b8906b82dbc2bfb71ecc52b0cf2c4616511fd426548d18462e3dbc88dcb73de64c28da5d26172f9d27f40a83864a"

RPROVIDES:${PN} += "go-doc \
go1.14-doc"

RDEPENDS:${PN} += "go1.14"

inherit rpm
