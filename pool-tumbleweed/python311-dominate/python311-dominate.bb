SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "python311-dominate-2.8.0-1.3.noarch.rpm"
RPM_HASH = "4b6405c148b285ed46e47d533f2c51471eb51800f8930b064eac9b08b131c33c39763bd26f562ffe2811fbc2e08ca9038e1b94c1bbe52a974ea5761d0586c4f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dominate \
python3.11dist-dominate \
python311-dominate \
python3dist-dominate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
