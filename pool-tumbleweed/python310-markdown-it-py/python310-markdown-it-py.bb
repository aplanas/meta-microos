SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-markdown-it-py-2.2.0-2.3.noarch.rpm"
RPM_HASH = "7d6eaf89fb14ad7c6763557c4e0f3d4850f8f25239975c90520d9c526bc4cc688dc4f675c1fd90c5fbee65c94610791ef75f4a6ee7a98b4ba91e48340e363027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-markdown-it-py \
python310-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-mdurl \
update-alternatives"

inherit rpm
