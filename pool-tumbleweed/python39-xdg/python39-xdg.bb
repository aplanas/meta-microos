SUMMARY = "Variables defined by the XDG Base Directory Specification"
DESCRIPTION = "xdg is a Python module which provides the variables defined by the \
XDG Base Directory Specification, to save you from duplicating the \
same snippet of logic in every Python utility you write that deals \
with user cache, configuration, or data files. It has no external \
dependencies."
LICENSE = "ISC"

PV = "5.1.1"

RPM_NAME = "python39-xdg-5.1.1-1.4.noarch.rpm"
RPM_HASH = "0524208b958db8184c0b836ef26e100aeeff019218eb19afe624d151381fec10c85126bcf4c7e9f6b89ae008bc84ddaca24db701ea526fec1c919f5651918d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xdg) \
python39-xdg \
python3dist(xdg)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
