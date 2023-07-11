SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python311-ordered-namespace-2019.6.8-1.20.noarch.rpm"
RPM_HASH = "b714618b80398ada6b2d80d7893f45ee0f136629a6cb5e6feee9081534d1f4fbf6a79018047a2bed97c3587ad200be9f660d934bd73a47916c99ad7756db1818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ordered-namespace \
python3.11dist-ordered-namespace \
python311-ordered-namespace \
python3dist-ordered-namespace"

RDEPENDS:${PN} += "python-abi"

inherit rpm
