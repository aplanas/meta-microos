SUMMARY = "Python IDE for beginners"
DESCRIPTION = "Thonny is a Python IDE meant for learning programming."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "thonny-4.0.2-1.4.noarch.rpm"
RPM_HASH = "fe12c0fb3808d9012289b862ff9ec776f65101e9c8aa5f5ef64697b18869b56a4efde4a7a36792a1f2e8f499fc631396d19a967850634fecee50dbe003c7af92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-thonny \
python3dist-thonny \
thonny"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
desktop-file-utils \
mypy \
python-abi \
python3-Send2Trash \
python3-astroid \
python3-asttokens \
python3-docutils \
python3-jedi \
python3-pylint \
python3-pyserial \
python3-tk"

inherit rpm
