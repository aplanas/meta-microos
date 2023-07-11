SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python39-jaraco.context-4.3.0-1.3.noarch.rpm"
RPM_HASH = "995f526c4dd012929b82fee4740570348e1a34980333386e50b262ae1bec53a8cab258a88cd883dd00dff1d7c6a29f7743a17aafeac29be3496f6bf544ad3bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.context \
python39-jaraco.context \
python3dist-jaraco.context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
