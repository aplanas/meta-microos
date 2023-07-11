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

RPM_NAME = "python310-hatch-1.7.0-2.1.noarch.rpm"
RPM_HASH = "1309e6a948d51da2550770c0b27ec65787814c56c781f3ae0597e1b8f50f65213b11f2a0a5c01b06bcaa169fb5e81264cf77a21c1ad8ad4e98b312945b646052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hatch \
python310-hatch \
python3dist-hatch"

RDEPENDS:${PN} += "-python3.10dist(pexpect) >= 4.8 with python3.10dist(pexpect) < 5 \
-python3.10dist(userpath) >= 1.7 with python3.10dist(userpath) < 2 \
/usr/bin/python3.10 \
/usr/bin/sh \
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
