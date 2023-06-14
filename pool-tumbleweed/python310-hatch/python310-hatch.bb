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

RPM_NAME = "python310-hatch-1.7.0-1.1.noarch.rpm"
RPM_HASH = "1f6258e049c55a8f0e7d89241f9cf00b4e89c5213e000a4a3022bb5956d819382ca8936ee29716ad5667f46f4ccab4b31bfce5a8280f94a53616df68e2587a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch \
python3.10dist-hatch \
python310-hatch \
python3dist-hatch"

RDEPENDS:${PN} += "-python3.10dist(pexpect) >= 4.8 with python3.10dist(pexpect) < 5 \
-python3.10dist(userpath) >= 1.7 with python3.10dist(userpath) < 2 \
/bin/sh \
/usr/bin/python3.10 \
git-core \
python-abi \
python3.10dist-click \
python3.10dist-hatchling \
python3.10dist-httpx \
python3.10dist-hyperlink \
python3.10dist-keyring \
python3.10dist-packaging \
python3.10dist-platformdirs \
python3.10dist-pyperclip \
python3.10dist-rich \
python3.10dist-shellingham \
python3.10dist-tomli-w \
python3.10dist-tomlkit \
python3.10dist-virtualenv \
update-alternatives"

inherit rpm
