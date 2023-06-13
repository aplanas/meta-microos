SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.5.1"

RPM_NAME = "python310-platformdirs-3.5.1-1.1.noarch.rpm"
RPM_HASH = "2cb0fcba3f959969415ff21c90da1d60419bccef903db51fdfd21fcc1f9db1665bd09be77ede9a1a6d9b5d20eb9e2230cabd293f00357eb209d563c5c4424c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformdirs \
python3.10dist(platformdirs) \
python310-platformdirs \
python3dist(platformdirs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
