SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package required to build and run Typer-based CLI applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-typer-0.9.0-1.1.noarch.rpm"
RPM_HASH = "41455becb1129839358b033c3c73d5b18712a0df1d7b41cdd86b5844069c4ce10133dc2abccd066172a15c177ec10b2d489b1ce48f339685b433de069714ef94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typer \
python3.10dist(typer) \
python310-typer \
python3dist(typer)"
RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
