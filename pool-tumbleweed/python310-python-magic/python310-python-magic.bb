SUMMARY = "File type identification using libmagic"
DESCRIPTION = "This module uses ctypes to access the libmagic file type \
identification library. It makes use of the local magic database and \
supports both textual and MIME-type output."
LICENSE = "Python-2.0"

PV = "0.4.27"

RPM_NAME = "python310-python-magic-0.4.27-4.1.noarch.rpm"
RPM_HASH = "0f6c533fd8a7a517422385a6340399a54ea9e7696aa9774d7bdd42d73ca693bcfb5825eca600dd20c79ceb91f9c2201c8eb04ff139def6d97b7233ec9ddce301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-magic \
python3.10dist(python-magic) \
python310-python-magic \
python3dist(python-magic)"

RDEPENDS:${PN} += "file \
python(abi)"

inherit rpm
