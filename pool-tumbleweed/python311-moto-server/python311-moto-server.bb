SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python311-moto-server-4.1.13-1.1.noarch.rpm"
RPM_HASH = "72cee1f36937f79bcdb47f36d74c12e2234b16fe0c4c30ef5e0eb885bc6f2a0e4f94241c6248150f9ff79cd92ab0cea0a9906559ebe87b7a3d0234dd402a63dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-server \
python311-moto-server"

RDEPENDS:${PN} += "python311-Flask \
python311-Flask-Cors \
python311-moto-all"

inherit rpm
