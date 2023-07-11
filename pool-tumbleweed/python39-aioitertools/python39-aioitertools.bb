SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-aioitertools-0.11.0-1.5.noarch.rpm"
RPM_HASH = "781f4e09cee49b90447ad470ec9fab515d0dc8fab60c946ad509245eed47fea22ce9fb65ae24a6f066739c6318108b7e012aad5cbc36921562f9e5d3e4ba5e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aioitertools \
python39-aioitertools \
python3dist-aioitertools"

RDEPENDS:${PN} += "python-abi \
python39-typing-extensions"

inherit rpm
