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

PV = "0.40.1"

RPM_NAME = "python39-yapf-0.40.1-1.1.noarch.rpm"
RPM_HASH = "f1855d312daf2c5e377e10f04ec0d2f4758899dfd86645739e62007f5ead0c2239260459a633d70f1e3d5164a16bc0d6ab6aa74e7bd95518f0659148a316f877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yapf \
python39-yapf \
python3dist-yapf"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-platformdirs \
update-alternatives"

inherit rpm
