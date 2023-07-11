SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python39-sphinxcontrib-autoprogram-0.1.8-2.3.noarch.rpm"
RPM_HASH = "31d48031b668f1e3f66dd6197c7ea58b50b93d905af889fb0b9ccee5db0c2ab839b2f73669c44f9e94d0526e122b174280225e4ce22b6d8d8dfe08e33341ce42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-autoprogram \
python39-sphinxcontrib-autoprogram \
python3dist-sphinxcontrib-autoprogram"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
