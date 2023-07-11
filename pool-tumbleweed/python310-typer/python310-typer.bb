SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package required to build and run Typer-based CLI applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-typer-0.9.0-1.3.noarch.rpm"
RPM_HASH = "ba3477116d11b32f85f371e1d0a8d4f49556f84ea1025da8d376a1d20dfc50bcff7ffd3ff1825a783231f64851fe009e7d5b001b62bc7ec125eb9913623ac1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typer \
python310-typer \
python3dist-typer"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
