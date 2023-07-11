SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-mizani-0.8.1-1.4.noarch.rpm"
RPM_HASH = "2385543cc4430cd4456ede9d59b17408a09ca1ff16be1b4509a21a831efa7a3c7e5be0df5bb35f8ec5b41a51f9c88347670fee99c54a01908093184c25c53341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mizani \
python39-mizani \
python3dist-mizani"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-palettable \
python39-pandas \
python39-scipy"

inherit rpm
