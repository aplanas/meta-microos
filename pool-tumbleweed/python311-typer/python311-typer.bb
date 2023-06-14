SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package required to build and run Typer-based CLI applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-typer-0.9.0-1.1.noarch.rpm"
RPM_HASH = "ee4e784ad38f48c9e25b91e552accfa40e1a1c37a081ec707d1dbb7d10b985b3e9570e0b05d2dbf4e0790e8b96455ec5c977af87b4ebf3188ce5bf7abcc31393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-typer \
python311-typer \
python3dist-typer"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
