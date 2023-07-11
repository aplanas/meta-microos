SUMMARY = "Backports of the traceback module"
DESCRIPTION = "A backport of traceback to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.4.0"

RPM_NAME = "python39-traceback2-1.4.0-7.3.noarch.rpm"
RPM_HASH = "4986bdc659077d4b0d746acb071bd4a7be2f02cfceb9afc235f412fbb65381ef0213103fd7d4f04b926fb2c958c8cc53b0f841bb6de2883e058ec22b9b6b6435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-traceback2 \
python39-traceback2 \
python3dist-traceback2"

RDEPENDS:${PN} += "python-abi \
python39-linecache2 \
python39-pbr"

inherit rpm
