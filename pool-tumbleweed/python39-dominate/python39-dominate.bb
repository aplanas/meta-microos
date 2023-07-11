SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "python39-dominate-2.8.0-1.3.noarch.rpm"
RPM_HASH = "be1a0f0b848a21186a4a709965b21c521e12755a0681a4b2a15e9f7a8e1ed602e28f8278aef7cf32cf778f72bac912776fd666a2e16bea92b2e5117f3df26857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dominate \
python39-dominate \
python3dist-dominate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
