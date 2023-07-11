SUMMARY = "Typer, build great CLIs. Easy to code. Based on Python type hints"
DESCRIPTION = "Typer is a library for building CLI applications based on Python 3.6+ type hints. \
 \
Based on type hints, Typer enables great editor support and completion for developers. \
With automatic help and completion, Typer makes CLIs easy to use for users. \
 \
This package provides the Typer Python package required to build and run Typer-based CLI applications."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-typer-0.9.0-1.3.noarch.rpm"
RPM_HASH = "68c3305202b677d401a577ab26cc2703c9a7ae5380d863baba3561cbd6484a19ce6f19a8e35c7612046eb5bef17e80e8fa5aac0715a88a70125324c36c81f35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typer \
python39-typer \
python3dist-typer"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
