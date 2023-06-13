SUMMARY = "Javadoc for relaxngcc"
DESCRIPTION = "This package contains javadoc for relaxngcc."
LICENSE = "Apache-1.1"

PV = "1.12"

RPM_NAME = "relaxngcc-javadoc-1.12-3.3.noarch.rpm"
RPM_HASH = "4924ccb4d7551c957dabd18a08e07508b195efb70183475000269e8c72f09ed1aa6edd28dfffb24791c773791c98aaaad77e479c1bfb2a0b8bdaa35a00651d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "relaxngcc-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
