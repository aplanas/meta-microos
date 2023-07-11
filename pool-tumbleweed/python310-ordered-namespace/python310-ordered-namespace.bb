SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python310-ordered-namespace-2019.6.8-1.20.noarch.rpm"
RPM_HASH = "728a22297034a377dda53a9b30e3b6ebb03d555ef6a65ba5992c94a01345a85ce2aa7764f4ffb3ecb706cd7ef454ef3ec09facae9bb5f09d57c5807c73bbeb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ordered-namespace \
python310-ordered-namespace \
python3dist-ordered-namespace"

RDEPENDS:${PN} += "python-abi"

inherit rpm
