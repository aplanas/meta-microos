SUMMARY = "A formatter for Python code"
DESCRIPTION = "YAPF is based off clang-format and reformats it to the closest \
formatting that conforms to the style guide, even if the original \
code did not violate the style guide. \
 \
This is in contrast to other formatters like autopep8 and pep8ify \
which are made to only remove lint errors from code, which has some \
limitations, like, code that conforms to the PEP 8 guidelines may not \
be reformatted."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "python39-yapf-0.33.0-1.1.noarch.rpm"
RPM_HASH = "b8b09cc96eed618d7e27c04cb425bc542d38537c6faf77b2d8b2d81e07a421b39be0c56c9a1c4c23d2be30cc750fa7446013e1cc0c443e27a1145460b2b1b7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yapf \
python39-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
