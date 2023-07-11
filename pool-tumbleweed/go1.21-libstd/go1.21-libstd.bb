SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.21rc2"

RPM_NAME = "go1.21-libstd-1.21rc2-1.1.aarch64.rpm"
RPM_HASH = "c93023bcf6d119517378d92d2637ad92184b795203dd1deb7f01adebff3d3f834e86fbedb4029d983a61a8ffbf45c16cb6bbcd8bd0781341e59f7481988aff41"

RPROVIDES:${PN} += "go-libstd \
go1.21-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
