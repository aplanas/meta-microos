SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-aioitertools-0.11.0-1.3.noarch.rpm"
RPM_HASH = "efac85f60f93c98ba8077d3d7ecde88ca3529e8d1d5f193235d0db696c109fbcceb2141978cbda18c5020a9d654256c35f8392e65b78762bfd9f24be8fc709c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aioitertools) \
python39-aioitertools \
python3dist(aioitertools)"
RDEPENDS:${PN} += "python(abi) \
python39-typing_extensions"

inherit rpm
