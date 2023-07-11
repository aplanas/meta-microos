SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-server-4.1.0-1.7.noarch.rpm"
RPM_HASH = "fa7f47d517584280323d0195002f2ee915cdb390fecd4f6c2c0a78b8b68b2567ad7110c696482f71d04234ac5de2834815b8591d3d470b9b83f0f95604923b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-moto-server"

RDEPENDS:${PN} += "python310-Flask \
python310-Flask-Cors \
python310-moto-all"

inherit rpm
