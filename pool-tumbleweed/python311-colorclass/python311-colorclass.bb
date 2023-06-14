SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python311-colorclass-2.2.2-2.1.noarch.rpm"
RPM_HASH = "4916482a5091f71ffb89a1c1c81f7d874f802fda3623ab9b8035df0dd191f145767b847cdce383e9610854767b7b2f2d90e3b2aaa80477ea5606889a76beb718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-colorclass \
python311-colorclass \
python3dist-colorclass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
