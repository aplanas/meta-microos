SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package required to build and run Typer-based CLI applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-typer-0.9.0-1.3.noarch.rpm"
RPM_HASH = "e0bcf053ccfa2ca1dc1a06d7af93ba4d245e2bc86850fca74a144f808e95dd71105b125de613176680c1184333dd20b6488076e9e2df48c451a5791327e03d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typer \
python3.11dist-typer \
python311-typer \
python3dist-typer"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
