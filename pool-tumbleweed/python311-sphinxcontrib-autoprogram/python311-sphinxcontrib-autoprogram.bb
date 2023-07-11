SUMMARY = "Sphinx extension to document CLI programs"
DESCRIPTION = "This contrib extension, sphinxcontrib.autoprogram, provides an automated way to \
document CLI programs. It scans arparser.ArgumentParser object, and then expands \
it into a set of .. program:: and .. option:: directives."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python311-sphinxcontrib-autoprogram-0.1.8-2.3.noarch.rpm"
RPM_HASH = "dfd896ee6a56890584d470fe87b9eba62224970e46d34df3f8ab00c89c4a66eb61895e400c7471d132c61b77068201064d804a8a997a47ea2cd0d4c5eb53d453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-autoprogram \
python3.11dist-sphinxcontrib-autoprogram \
python311-sphinxcontrib-autoprogram \
python3dist-sphinxcontrib-autoprogram"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
