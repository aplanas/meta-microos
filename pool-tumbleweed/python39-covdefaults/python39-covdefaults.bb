SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-covdefaults-2.3.0-2.3.noarch.rpm"
RPM_HASH = "e94bea14f23196659c6dbe65418e3d9291b063b9849e19a66dd23163af8c8a9914f21b30ead5130430c069a2424484d2977935f18a9bf9e085810261ba274c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-covdefaults \
python39-covdefaults \
python3dist-covdefaults"

RDEPENDS:${PN} += "python-abi \
python39-coverage"

inherit rpm
