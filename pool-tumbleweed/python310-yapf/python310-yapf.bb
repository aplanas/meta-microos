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

RPM_NAME = "python310-yapf-0.33.0-1.1.noarch.rpm"
RPM_HASH = "1279f56595bd6971068bca7188e7677120c9d63738bf5d6b45d9abe2aad1d63be2d13956daf82828f37d8f262860e1cfc6d73b40a238638a9c65b639e3fe7760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yapf \
python3.10dist(yapf) \
python310-yapf \
python3dist(yapf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
