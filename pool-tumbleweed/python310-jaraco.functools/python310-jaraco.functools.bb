SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python310-jaraco.functools-3.6.0-2.3.noarch.rpm"
RPM_HASH = "81374df96d523b6261f21508041ea2037b31e6044ccc37e2fe68bc7ad153e11dcd079127d951422550aee50a05ff9afb19939f435edbbdd6dfd9d06b4285a1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.functools \
python310-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.packaging \
python310-more-itertools"

inherit rpm
