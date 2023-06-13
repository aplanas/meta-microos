SUMMARY = "Modern, extensible Python project management"
DESCRIPTION = "Hatch is a modern, extensible Python project manager. \
 \
Features \
  * Standardized build system with reproducible builds by default \
  * Robust environment management with support for custom scripts \
  * Easy publishing to PyPI or other indexes \
  * Version management \
  * Configurable project generation with sane defaults \
  * Responsive CLI, ~2-3x faster than equivalent tools"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-hatch-1.7.0-1.1.noarch.rpm"
RPM_HASH = "d433146d050ce252c24191ab07df15f69c1a1902811920c813a5fa716ecba68234af235da574c71c292f64dc684631540c8f05d5de4e49e6e5208f989dfb6d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatch) \
python39-hatch \
python3dist(hatch)"

RDEPENDS:${PN} += "(python3.9dist(pexpect) >= 4.8 with python3.9dist(pexpect) < 5) \
(python3.9dist(userpath) >= 1.7 with python3.9dist(userpath) < 2) \
/bin/sh \
/usr/bin/python3.9 \
git-core \
python(abi) \
python3.9dist(click) \
python3.9dist(hatchling) \
python3.9dist(httpx) \
python3.9dist(hyperlink) \
python3.9dist(keyring) \
python3.9dist(packaging) \
python3.9dist(platformdirs) \
python3.9dist(pyperclip) \
python3.9dist(rich) \
python3.9dist(shellingham) \
python3.9dist(tomli-w) \
python3.9dist(tomlkit) \
python3.9dist(virtualenv) \
update-alternatives"

inherit rpm
