SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-terminaltables-3.1.0-2.16.noarch.rpm"
RPM_HASH = "083b8a92ca183e7e1ef6fdfc9ab7f9327094c77af71ddce9d0d9da5f7dec9242bd94ba78e932fd5bc85f84a920f6533762060ab779d7bafb397a31a9b327107f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-terminaltables \
python310-terminaltables \
python3dist-terminaltables"

RDEPENDS:${PN} += "python-abi \
python310-colorama \
python310-colorclass \
python310-termcolor"

inherit rpm
