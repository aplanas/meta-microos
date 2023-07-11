SUMMARY = "Documentation for python-happybase"
DESCRIPTION = "HappyBase is a Python library to interact with Apache HBase. \
 \
This package contains the documentation."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python-happybase-doc-1.2.0-3.9.noarch.rpm"
RPM_HASH = "b155a7e24a5fbd4cddc6dad23cd57c0100dce6177cc92c5223d8878f5d21a31bc4e7f75ecdc11f786009b6e2fe1f5f3b2595d85f52999b82135e8156f514426f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-happybase-doc \
python310-happybase-doc \
python311-happybase-doc \
python39-happybase-doc"

RDEPENDS:${PN} += ""

inherit rpm
