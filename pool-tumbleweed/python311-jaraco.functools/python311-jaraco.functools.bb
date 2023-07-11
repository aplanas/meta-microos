SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python311-jaraco.functools-3.6.0-2.3.noarch.rpm"
RPM_HASH = "277de9186372ff245c341f1fe434a15c262ce12e3ac5b1952927aa788dec19cd3434fce56902d3ff130c430aef355fcf54febb487976efbf068ea252bea5e87b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.functools \
python3.11dist-jaraco.functools \
python311-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.packaging \
python311-more-itertools"

inherit rpm
