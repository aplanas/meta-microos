SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python39-PyRSS2Gen-1.1-2.13.noarch.rpm"
RPM_HASH = "cc0c7869e4f41d17f958eea4baf20a45d09b47c4819a09b181bc861a6e508f3b98b71c9be4afca5b43a8d7ae703a13a3ce855daba7f9b8915052e10a5316a35b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3.9dist(pyrss2gen) \
python39-PyRSS2Gen \
python3dist(pyrss2gen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
