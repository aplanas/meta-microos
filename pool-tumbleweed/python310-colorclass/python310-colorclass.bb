SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python310-colorclass-2.2.2-2.3.noarch.rpm"
RPM_HASH = "857c20a9a21edfe0cfa2e8d9efe7d9cb5b5373f1a6f8b52cb61e68ab350a36f552194de27a87632f289c7e1062f0f308401946c58c25ee630c695b9379c79dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colorclass \
python310-colorclass \
python3dist-colorclass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
