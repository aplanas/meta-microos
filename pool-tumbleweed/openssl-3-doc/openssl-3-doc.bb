SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3-doc-3.1.1-1.1.noarch.rpm"
RPM_HASH = "168aea6056d0688c548de9a40c7f7651322980ac5fcbe877b1dae34e03a497225ecb93d4186e4dc9fb04126d4e08f74b01b7beae155134f2cfd5d388e1e551a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-3-doc \
openssl-doc"

RDEPENDS:${PN} += ""

inherit rpm
