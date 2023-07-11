SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python310-sadisplay-0.4.9-2.18.noarch.rpm"
RPM_HASH = "54b1f8f7009c6ae931fe696c0f486c629a279f9fd1849a788ab775d3a053572cea9305ea9220955f87730e6ca6de990fd856c3fe847fefab4f428585022373cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sadisplay \
python310-sadisplay \
python3dist-sadisplay"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-SQLAlchemy \
update-alternatives"

inherit rpm
