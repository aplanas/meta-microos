SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-server-4.1.0-1.7.noarch.rpm"
RPM_HASH = "d0539a0a0a96d82e5512347aee667e1f517581174c0a73a3921d982f5e452b7899fed3662555af07f9443ce10b1258aba47358cfb6bab7bae5ca83296d10c8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-moto-server"

RDEPENDS:${PN} += "python39-Flask \
python39-Flask-Cors \
python39-moto-all"

inherit rpm
