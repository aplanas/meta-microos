SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python310-PasteDeploy-2.1.1+git.1652668078.0f0697d-2.1.noarch.rpm"
RPM_HASH = "5827a6081bbee742f4076f324b75a4141fe8d84b81f15495ab60171ebc933390e5565a17d9c6c7e9c9c3fe4a10100423cbb6d7983464ee56250f66b8d457a830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PasteDeploy \
python3-pastedeploy \
python3.10dist(pastedeploy) \
python310-PasteDeploy \
python310-pastedeploy \
python3dist(pastedeploy)"

RDEPENDS:${PN} += "python(abi) \
python310-Paste \
python310-setuptools"

inherit rpm
