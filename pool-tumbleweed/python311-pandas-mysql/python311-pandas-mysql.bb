SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-mysql-2.0.2-4.1.noarch.rpm"
RPM_HASH = "ca9f3f75de0c0895a874bebb28be2e5a0b6f1f3ab490e78c7e59a7c636466703e7bf545ac68948f89f4209d10a672e664cabeccf67e937bbd7524241ee4272b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-mysql \
python311-pandas-mysql"

RDEPENDS:${PN} += "python311-PyMySQL \
python311-SQLAlchemy \
python311-pandas"

inherit rpm
