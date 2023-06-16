SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-markdown-it-py-2.2.0-2.1.noarch.rpm"
RPM_HASH = "a4731ffc9dcbd759670a3d684a502773ac32703a77531d9e612b18da66e5063cc345855876b86f42bf99442047a225db7012e620eaf424b18aee677713bc494d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-markdown-it-py \
python3.10dist-markdown-it-py \
python310-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-mdurl \
update-alternatives"

inherit rpm
