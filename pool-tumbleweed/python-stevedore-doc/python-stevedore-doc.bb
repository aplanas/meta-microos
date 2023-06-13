SUMMARY = "Documentation for python-stevedore"
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
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python-stevedore-doc-5.0.0-1.1.noarch.rpm"
RPM_HASH = "4942120a83964ddf32ea8070200f47a1fe54381cce5236c1a9d2e3eba0f9f0efbb6f41485487021b7e01da321fd5d5de01014215714ef2e5243728c838bae77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-stevedore-doc"

RDEPENDS:${PN} += ""

inherit rpm
