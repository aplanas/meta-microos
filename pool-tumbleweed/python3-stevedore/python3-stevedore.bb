SUMMARY = "Manage dynamic plugins for Python applications"
DESCRIPTION = "Python makes loading code dynamically easy, allowing you to configure \
and extend your application by discovering and loading extensions \
(plugins) at runtime. Many applications implement their own \
library for doing this, using ``__import__`` or ``importlib``. \
stevedore avoids creating yet another extension \
mechanism by building on top of setuptools entry points. The code \
for managing entry points tends to be repetitive, though, so stevedore \
provides manager classes for implementing common patterns for using \
dynamically loaded extensions. \
 \
This package contains the Python 3.x module"
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python3-stevedore-5.1.0-1.1.noarch.rpm"
RPM_HASH = "704eecb9573ff5ffe4369ca48977fb3ccf2659d76a09f6cc7533ce4b0c7e7d180a90ed40a4c08bffd169b0d6e80c15382dee70680ccd2e3767a5af472b3ee86d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stevedore \
python3.11dist-stevedore \
python3dist-stevedore"

RDEPENDS:${PN} += "python-abi \
python3-importlib-metadata \
python3-pbr"

inherit rpm
