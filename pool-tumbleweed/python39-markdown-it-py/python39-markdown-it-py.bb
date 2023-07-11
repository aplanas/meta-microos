SUMMARY = "Python port of markdown-it Markdown parsing"
DESCRIPTION = "This is a Python port of [markdown-it], and some of its associated plugins. \
 \
It follows the CommonMark spec for baseline parsing, has a configurable syntax and is pluggable."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-markdown-it-py-2.2.0-2.3.noarch.rpm"
RPM_HASH = "84c17e5baf63b95e26d6a76d96788ee217f7087bf0677ccba96d1d5a8762b81404ba931236214029377cdc4985f64d3b3f802eba194bbba6f48e2f784e6094ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markdown-it-py \
python39-markdown-it-py \
python3dist-markdown-it-py"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-mdurl \
update-alternatives"

inherit rpm
