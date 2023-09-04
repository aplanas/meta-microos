SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-mysql-2.0.3-1.2.noarch.rpm"
RPM_HASH = "bbce87d86d8ad6df9a157fed0dc3ae7dba75159cdb167217e795383f8f0173726c06708d3a9da3b5fac13b20ae34ba8c8f9ab9e3142af39a54b80bff9293331d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-mysql"

RDEPENDS:${PN} += "python39-PyMySQL \
python39-SQLAlchemy \
python39-pandas"

inherit rpm
