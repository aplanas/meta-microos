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

PV = "5.1.0"

RPM_NAME = "python-stevedore-doc-5.1.0-1.1.noarch.rpm"
RPM_HASH = "3063c204d2d2c8be009edecbed7a48609b04105bb0a4d9b1f8f6083839a3e75fe54cb2a33fed6aedf0c282182b0cd343a34766adc1dc137771305270084b1762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-stevedore-doc"

RDEPENDS:${PN} += ""

inherit rpm
