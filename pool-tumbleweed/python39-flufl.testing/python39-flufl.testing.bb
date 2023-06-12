SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python39-flufl.testing-0.8-1.13.noarch.rpm"
RPM_HASH = "15bf07784845626ad4393a665dbb2be881ea4dec494f60d5c0fc9ee3f8c209cc91c5809f83759fb5800f1fd2b8da4dc749304c14f4b78183addb163454f34bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flufl.testing) \
python39-flufl.testing \
python3dist(flufl.testing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
