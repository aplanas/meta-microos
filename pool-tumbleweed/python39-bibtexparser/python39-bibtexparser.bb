SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files.."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python39-bibtexparser-1.2.0-1.7.noarch.rpm"
RPM_HASH = "836f2aa195a39427f0363337d1024160835fdc6cfa59489615e94357281dea34f6402efe97243f3f3af8c4e3b3766a2434f8ea08ad734bf824c19de03f11c853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bibtexparser \
python39-bibtexparser \
python3dist-bibtexparser"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-pyparsing"

inherit rpm
